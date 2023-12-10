package com.hexaware.codingchallenge.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.codingchallenge.DTO.PlayerDTO;
import com.hexaware.codingchallenge.entity.Player;
import com.hexaware.codingchallenge.exception.PlayerNotFoundException;
import com.hexaware.codingchallenge.repository.IPlayerRepository;
@Service
public class PlayerServiceImp implements IPlayerService {
	@Autowired
	IPlayerRepository playerRepository;

	@Override
	public PlayerDTO addPlayer(PlayerDTO playerDto) {
		Player player =new Player();
		
		player.setCountry(playerDto.getCountry());
		player.setJerssyNumber(playerDto.getJerssyNumber());
		player.setPlayerName(playerDto.getPlayerName());
		player.setRole(playerDto.getRole());
		player.setTeamName(playerDto.getTeamName());
		player.setTotalMatches(playerDto.getTotalMatches());
		
		Player playerTemp=playerRepository.save(player);
		return new PlayerDTO(playerTemp.getPlayerId(),playerTemp.getPlayerName(),playerTemp.getJerssyNumber(),playerTemp.getRole(),playerTemp.getTotalMatches(),playerTemp.getTeamName(),playerTemp.getCountry());
	}

	@Override
	public List<PlayerDTO> getAllPlayers() throws PlayerNotFoundException{
		List<Player> player=playerRepository.findAll();
		List<PlayerDTO> playerDto=new ArrayList<>();
		for(Player playerTemp:player) {
			PlayerDTO playerDtoTemp=new PlayerDTO();
			playerDtoTemp.setCountry(playerTemp.getCountry());
			playerDtoTemp.setPlayerId(playerTemp.getPlayerId());
			playerDtoTemp.setJerssyNumber(playerTemp.getJerssyNumber());
			playerDtoTemp.setPlayerName(playerTemp.getPlayerName());
			playerDtoTemp.setRole(playerTemp.getRole());
			playerDtoTemp.setTeamName(playerTemp.getTeamName());
			playerDtoTemp.setTotalMatches(playerTemp.getTotalMatches());
			
			playerDto.add(playerDtoTemp);	
		}
		return playerDto;
	}
	
	  @Override public Player getPlayerById(int playerId) {
	  
	  return playerRepository.findById(playerId).orElse(new Player()); }
	  
	  @Override public void deleteById(int playerId) {
	  
	  playerRepository.deleteById(playerId); }
	 

	@Override
	public PlayerDTO updatePlayerById(PlayerDTO playerDto,int playerId) {
		Player player =playerRepository.findById(playerId).orElse(new Player());
		
		player.setCountry(playerDto.getCountry());
		player.setJerssyNumber(playerDto.getJerssyNumber());
		player.setPlayerName(playerDto.getPlayerName());
		player.setRole(playerDto.getRole());
		player.setTeamName(playerDto.getTeamName());
		player.setTotalMatches(playerDto.getTotalMatches());
		
		Player playerTemp=playerRepository.save(player);
		return new PlayerDTO(playerTemp.getPlayerId(),playerTemp.getPlayerName(),playerTemp.getJerssyNumber(),playerTemp.getRole(),playerTemp.getTotalMatches(),playerTemp.getTeamName(),playerTemp.getCountry());
	}
	


}
