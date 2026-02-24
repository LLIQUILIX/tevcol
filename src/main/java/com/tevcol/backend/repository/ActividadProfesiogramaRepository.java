package com.tevcol.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tevcol.backend.entity.ActividadProfesiograma;

@Repository
public interface ActividadProfesiogramaRepository extends JpaRepository<ActividadProfesiograma, Long> {

}