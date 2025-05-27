package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.entities.GameList;

public interface GameRepository extends JpaRepository<Game, Long>{

}
