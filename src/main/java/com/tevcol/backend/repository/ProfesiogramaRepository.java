package com.tevcol.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tevcol.backend.entity.Profesiograma;

@Repository
public interface ProfesiogramaRepository extends JpaRepository<Profesiograma, Long> {

}