package com.matheusromagit.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheusromagit.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
