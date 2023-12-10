package com.hexaware.codingchallenge.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Player {

	@SequenceGenerator(name="player_seq",initialValue=1,allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="player_seq")
	@Id
	private int playerId;
	private String playerName;
	private int jerssyNumber;
	private String role;
	private int totalMatches;
	private String teamName;
	private String country;
	public Player() {
		super();
	}
	public Player(int playerId, String playerName, int jerssyNumber, String role, int totalMatches, String teamName,
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
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", jerssyNumber=" + jerssyNumber
				+ ", role=" + role + ", totalMatches=" + totalMatches + ", teamName=" + teamName + ", country="
				+ country + "]";
	}
	
	
	

}
