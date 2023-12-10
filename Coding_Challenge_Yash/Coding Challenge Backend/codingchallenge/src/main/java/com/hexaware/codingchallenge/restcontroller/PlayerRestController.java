package com.hexaware.codingchallenge.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.codingchallenge.DTO.PlayerDTO;
import com.hexaware.codingchallenge.entity.Player;
import com.hexaware.codingchallenge.exception.PlayerNotFoundException;
import com.hexaware.codingchallenge.service.IPlayerService;

import jakarta.validation.Valid;


@CrossOrigin(origins="http://localhost:4200/")
@RestController
@RequestMapping("/api/player")
public class PlayerRestController {
	
	@Autowired
	IPlayerService service;
	
	@PostMapping("/addplayer")
	
	public PlayerDTO addPlayer(@RequestBody @Valid PlayerDTO playerDto) {
		return service.addPlayer(playerDto);
		
	}
	
	@PutMapping("/updateplayer/{playerId}")
	
	public PlayerDTO updatePlayer(@RequestBody @Valid PlayerDTO playerDto,@PathVariable int playerId) {
		return service.updatePlayerById(playerDto,playerId);
		
	}
	
	
	  @GetMapping("/getallplayers") public List<PlayerDTO> getAllPlayer(){
	  
	  List<PlayerDTO> PlayerDto=service.getAllPlayers(); if(PlayerDto.isEmpty()) {
	  
	  
	  throw new PlayerNotFoundException(HttpStatus.NO_CONTENT,"Zero players"); }
	  return PlayerDto; }
	  
	
	  @GetMapping("/getplayerbyId/{playerId}") public Player
	  getPlayerById(@PathVariable int playerId) { return
	  service.getPlayerById(playerId);
	  
	  }
	 
		
		  @DeleteMapping("/deletebyid/{playerId}") public ResponseEntity<String>
		  deleteById(@PathVariable int adminId) {
		  
		  service.deleteById(adminId); return new
		  ResponseEntity<>("player deleted sucessfully", HttpStatus.ACCEPTED); }
		 
}
