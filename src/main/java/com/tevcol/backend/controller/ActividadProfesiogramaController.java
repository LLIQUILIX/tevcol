package com.tevcol.backend.controller;

import com.tevcol.backend.entity.ActividadProfesiograma;
import com.tevcol.backend.service.ActividadProfesiogramaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/actividades")
@CrossOrigin("*")
public class ActividadProfesiogramaController {

    private final ActividadProfesiogramaService actividadService;

    public ActividadProfesiogramaController(ActividadProfesiogramaService actividadService) {
        this.actividadService = actividadService;
    }

    @GetMapping
    public ResponseEntity<List<ActividadProfesiograma>> listar() {
        return ResponseEntity.ok(actividadService.listarTodas());
    }

    // NUEVO MÉTODO PARA FILTRADO REAL POR PROFESIOGRAMA
    @GetMapping("/profesiograma/{id}")
    public ResponseEntity<List<ActividadProfesiograma>> buscarPorProfesiograma(@PathVariable Long id) {
        // Filtramos en caliente para no complicar el Service si tienes poco tiempo
        List<ActividadProfesiograma> filtradas = actividadService.listarTodas().stream()
                .filter(a -> a.getCodigoProf() != null && a.getCodigoProf().equals(id))
                .collect(Collectors.toList());
        return ResponseEntity.ok(filtradas);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ActividadProfesiograma> buscarPorId(@PathVariable Long id) {
        return actividadService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<ActividadProfesiograma> guardar(@RequestBody ActividadProfesiograma actividad) {
        return ResponseEntity.ok(actividadService.guardar(actividad));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        actividadService.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}