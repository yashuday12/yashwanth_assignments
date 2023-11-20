package com.hexaware.springjdbcpractice.Dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.hexaware.springjdbcpractice.model.Passenger;

public interface IPassengerDao {
	public int insertDetails(Passenger passenger);

}
