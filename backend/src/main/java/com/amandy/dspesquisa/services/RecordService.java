package com.amandy.dspesquisa.services;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.amandy.dspesquisa.dto.RecordDTO;
import com.amandy.dspesquisa.dto.RecordInsertDTO;
import com.amandy.dspesquisa.entities.Game;
import com.amandy.dspesquisa.entities.Record;
import com.amandy.dspesquisa.repositories.GameRepository;
import com.amandy.dspesquisa.repositories.RecordRepository;

@Service
public class RecordService {

	@Autowired
	private RecordRepository repository;

	@Autowired 
	private GameRepository gameRepository;
	
	@Transactional
	public RecordDTO insert(RecordInsertDTO dto) {
		Record entity = new Record();
		entity.setName(dto.getName());
		entity.setAge(dto.getAge());
		entity.setMoment(Instant.now());
		
		Game game = gameRepository.getOne(dto.getGameid());
		entity.setGame(game);
		
		entity = repository.save(entity);
		return new RecordDTO(entity);
	}
}
