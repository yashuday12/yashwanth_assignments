package com.hexaware.codingchallenge.DTO;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class PlayerDTO {
	
	private int playerId;
	@NotBlank(message = "player name is required")
    @Size(min = 2, max = 50, message = "player name must be between 2 and 50 characters")
	private String playerName;
	@Positive(message = "Jersey number must be a positive number")
	
	@Min(value=2)
	@Max(value=99)
	private int jerssyNumber;
	
	@Pattern(regexp="^(batsman|bowler|all-rounder)$")
	private String role;
	

	 @Positive(message = "Total matches must be a positive number")
	 private int totalMatches;
	 @NotBlank(message = "team Name  is required")
	    @Size(min = 2, max = 50, message = "team name must be between 2 and 50 characters")
	private String teamName;
	 @NotBlank(message = "country name is required")
	    @Size(min = 2, max = 50, message = "country name must be between 2 and 50 characters")
	private String country;
    
	public PlayerDTO() {
		super();
	}
	public PlayerDTO(int playerId, String playerName, int jerssyNumber, String role, int totalMatches, String teamName,
			String country) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.jerssyNumber = jerssyNumber;
		this.role = role;
		this.totalMatches = totalMatches;
		this.teamName = teamName;
		this.country = country;
	}
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getJerssyNumber() {
		return jerssyNumber;
	}
	public void setJerssyNumber(int jerssyNumber) {
		this.jerssyNumber = jerssyNumber;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getTotalMatches() {
		return totalMatches;
	}
	public void setTotalMatches(int totalMatches) {
		this.totalMatches = totalMatches;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "PlayerDTO [playerId=" + playerId + ", playerName=" + playerName + ", jerssyNumber=" + jerssyNumber
				+ ", role=" + role + ", totalMatches=" + totalMatches + ", teamName=" + teamName + ", country="
				+ country + "]";
	}

	
	
}
