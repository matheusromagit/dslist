package com.matheusromagit.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheusromagit.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
