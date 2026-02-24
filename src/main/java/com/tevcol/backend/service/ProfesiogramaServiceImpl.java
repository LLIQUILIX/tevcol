package com.tevcol.backend.service;

import com.tevcol.backend.entity.Profesiograma;
import com.tevcol.backend.repository.ProfesiogramaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfesiogramaServiceImpl implements ProfesiogramaService {

    private final ProfesiogramaRepository profesiogramaRepository;

    public ProfesiogramaServiceImpl(ProfesiogramaRepository profesiogramaRepository) {
        this.profesiogramaRepository = profesiogramaRepository;
    }

    @Override
    public List<Profesiograma> listarTodos() {
        return profesiogramaRepository.findAll();
    }

    @Override
    public Optional<Profesiograma> buscarPorId(Long id) {
        return profesiogramaRepository.findById(id);
    }

    @Override
    public Profesiograma guardar(Profesiograma profesiograma) {
        return profesiogramaRepository.save(profesiograma);
    }

    @Override
    public void eliminar(Long id) {
        profesiogramaRepository.deleteById(id);
    }
}