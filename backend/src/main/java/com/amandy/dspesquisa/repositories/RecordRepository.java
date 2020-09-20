package com.amandy.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amandy.dspesquisa.entities.Record;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long>{

}
