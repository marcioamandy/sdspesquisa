package com.amandy.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amandy.dspesquisa.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long>{

}
