package com.tevcol.backend.service;

import com.tevcol.backend.entity.ActividadProfesiograma;
import com.tevcol.backend.repository.ActividadProfesiogramaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ActividadProfesiogramaServiceImpl implements ActividadProfesiogramaService {

    private final ActividadProfesiogramaRepository actividadRepository;

    public ActividadProfesiogramaServiceImpl(ActividadProfesiogramaRepository actividadRepository) {
        this.actividadRepository = actividadRepository;
    }

    @Override
    public List<ActividadProfesiograma> listarTodas() {
        return actividadRepository.findAll();
    }

    @Override
    public Optional<ActividadProfesiograma> buscarPorId(Long id) {
        return actividadRepository.findById(id);
    }

    @Override
    public ActividadProfesiograma guardar(ActividadProfesiograma actividad) {
        return actividadRepository.save(actividad);
    }

    @Override
    public void eliminar(Long id) {
        actividadRepository.deleteById(id);
    }
}