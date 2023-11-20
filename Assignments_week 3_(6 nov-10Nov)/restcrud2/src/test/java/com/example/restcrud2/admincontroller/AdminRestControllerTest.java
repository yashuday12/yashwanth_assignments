package com.example.restcrud2.admincontroller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import com.example.restcrud2.entities.Admin;

@SpringBootTest
class AdminRestControllerTest {
	  @Autowired
	  RestTemplate restTemplate;
	  org.slf4j.Logger logger =LoggerFactory.getLogger(AdminRestControllerTest.class);
	@Test
	void testAddEmployee() {
		fail("Not yet implemented");
	}

	@Test
	void testGetAll() {
		fail("Not yet implemented");
	}

	@Test
	void testUpdateUser() {
		Admin adminDTO=new Admin();
		adminDTO.setAdminId(3);
		adminDTO.setAdminName("prashanth");
		adminDTO.setAdminPassword("surya");
		int id=3;
		restTemplate.put("http://localhost:8181/api/admin/update", adminDTO,Admin.class);
		Admin admin=restTemplate.getForObject("http://localhost:8181/api/admin/get/3",Admin.class);
		logger.info("uday"+admin);
		assertEquals(adminDTO,admin);
	}

	/*@Test
	void testDeleteUserById() {
		restTemplate.delete("http://localhost:8181/api/admin/delete/1", Admin.class);
	}*/

	@Test
	void testGetUserByGender() {
		fail("Not yet implemented");
	}

	@Test
	void testGetAdminSorted() {
		fail("Not yet implemented");
	}

}
