package com.amandy.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amandy.dspesquisa.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
