package com.hexaware.passengerapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.passengerapi.entites.Passenger;
@Repository
public interface IPassengerRepository extends JpaRepository<Passenger, Integer>{

}
