package com.hexaware.springjdbcpractice.Dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hexaware.springjdbcpractice.model.Passenger;
import com.hexaware.springjdbcpractice.service.PassengerService;
@Repository
public class PassengerDao implements IPassengerDao {

	JdbcTemplate jdbcTemplate;
	@Autowired
	public PassengerDao(DataSource datasource) {
		jdbcTemplate=new JdbcTemplate(datasource);
		System.out.println(jdbcTemplate);

	}
	@Override
	public int insertDetails(Passenger passenger) {
		// TODO Auto-generated method stub
		String query="insert into passenger(passengerId,passengerName,Age) values(?,?,?)";
		int count=jdbcTemplate.update(query,passenger.getPassengerId(),passenger.getPassengerName(),passenger.getAge());
		return count;
	}

}
