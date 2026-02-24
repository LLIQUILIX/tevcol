package com.tevcol.backend.service;

import com.tevcol.backend.entity.Profesiograma;
import java.util.List;
import java.util.Optional;

public interface ProfesiogramaService {

    List<Profesiograma> listarTodos();

    Optional<Profesiograma> buscarPorId(Long id);

    Profesiograma guardar(Profesiograma profesiograma);

    void eliminar(Long id);
}