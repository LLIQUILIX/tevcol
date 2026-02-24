package com.tevcol.backend.controller;

import com.tevcol.backend.entity.Profesiograma;
import com.tevcol.backend.service.ProfesiogramaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/profesiogramas")
@CrossOrigin("*")
public class ProfesiogramaController {

    private final ProfesiogramaService profesiogramaService;

    public ProfesiogramaController(ProfesiogramaService profesiogramaService) {
        this.profesiogramaService = profesiogramaService;
    }

    @GetMapping
    public ResponseEntity<List<Profesiograma>> listar() {
        return ResponseEntity.ok(profesiogramaService.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Profesiograma> buscarPorId(@PathVariable Long id) {
        return profesiogramaService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Profesiograma> guardar(@RequestBody Profesiograma profesiograma) {
        return ResponseEntity.ok(profesiogramaService.guardar(profesiograma));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        profesiogramaService.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}