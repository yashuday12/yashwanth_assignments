package com.hexaware.codingchallenge.service;

import java.util.List;

import com.hexaware.codingchallenge.DTO.PlayerDTO;
import com.hexaware.codingchallenge.entity.Player;

public interface IPlayerService {
	
	public PlayerDTO addPlayer(PlayerDTO playerDto);
	public List<PlayerDTO> getAllPlayers();
	public Player getPlayerById(int playerId);
	public void deleteById(int playerId);
	public PlayerDTO updatePlayerById(PlayerDTO playerDto,int playerId);
}
