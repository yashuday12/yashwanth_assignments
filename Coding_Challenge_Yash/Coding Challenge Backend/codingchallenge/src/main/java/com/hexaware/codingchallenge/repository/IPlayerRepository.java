package com.hexaware.codingchallenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.codingchallenge.entity.Player;

public interface IPlayerRepository extends JpaRepository<Player, Integer>{

}
