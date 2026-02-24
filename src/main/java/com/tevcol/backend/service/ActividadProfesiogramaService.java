package com.tevcol.backend.service;

import com.tevcol.backend.entity.ActividadProfesiograma;

import java.util.List;
import java.util.Optional;

public interface ActividadProfesiogramaService {

    List<ActividadProfesiograma> listarTodas();

    Optional<ActividadProfesiograma> buscarPorId(Long id);

    ActividadProfesiograma guardar(ActividadProfesiograma actividad);

    void eliminar(Long id);
}