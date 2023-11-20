package com.example.restcrud2.admincontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restcrud2.entities.Admin;
//import com.example.restcrud2.exception.AdminNotFoundException;
import com.example.restcrud2.services.AdminServiceImp;
import com.example.restcrud2.services.IAdminService;

@RestController
@RequestMapping("/api/admin")
public class AdminRestController {
    @Autowired
	IAdminService service;

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome this endpoint is not secure";
    }

	@PostMapping(value="/add",consumes="application/json",produces="application/json")
	public Admin addEmployee(@RequestBody Admin admin) {
		boolean isValid=AdminServiceImp.inputValidation(admin);
		Admin ad=null;
		if(isValid) {
		ad =service.insertAdmin(admin);
		}
		return ad;
	}
	@GetMapping("/getall")
	 @PreAuthorize("hasAuthority('ROLE_USER')")
	public List<Admin> getAll(){
		return service.getAllAdmin();
	}
	@PutMapping("/update")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public Admin updateUser( @RequestBody Admin admin) {
		return service.updateAdmin(admin);
	}
	@GetMapping("/get/{adminId}")
	 @PreAuthorize("hasAuthority('ROLE_USER')")
	public Admin getUserbyId(@PathVariable int adminId)  {
		//String s;
		//try {
		Admin admin= service.getAdminById(adminId);
		/*if(admin == null) {
			throw new AdminNotFoundException("asdasd");
		}
		else {
		       s=admin.toString();
		}
		}
		catch(AdminNotFoundException e) {
			s=e.getMessage();
		}*/
		return admin;
		
	}
	@DeleteMapping("/delete/{adminId}")
	 @PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public String deleteUserById(@PathVariable int adminId) {
		service.deleteAdminById(adminId);
		return "record deleted";
	
	}
	@GetMapping("/getadminbyname/{adminName}")
	 @PreAuthorize("hasAuthority('ROLE_USER')")
	public Admin getUserByGender(@PathVariable String adminName) {
		return service.getUserByAdminName(adminName);
	}
	@GetMapping("/getAdminsorted/{adminId}")
	public List<Admin> getAdminSorted(@PathVariable int adminId) {
		return service.getAdminSorted(adminId);
	}
	}

