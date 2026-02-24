package com.tevcol.backend.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "actividad_profesiograma")
public class ActividadProfesiograma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_actprof")
    private Long codigoActprof;

    @ManyToOne
    @JoinColumn(name = "codigo_prof", nullable = false)
    private Profesiograma profesiograma;

    @Column(name = "codigo_car")
    private Long codigoCar;

    @Column(name = "descripcion_actprof")
    private String descripcionActprof;

    @Column(name = "creacion_actprof")
    private LocalDateTime creacionActprof;

    @Column(name = "actualizacion_actprof")
    private LocalDateTime actualizacionActprof;

    @Column(name = "creacion_usu")
    private Long creacionUsu;

    @Column(name = "actualizacion_usu")
    private Long actualizacionUsu;



    public Long getCodigoActprof() {
        return codigoActprof;
    }

    public void setCodigoActprof(Long codigoActprof) {
        this.codigoActprof = codigoActprof;
    }

    public Profesiograma getProfesiograma() {
        return profesiograma;
    }

    public void setProfesiograma(Profesiograma profesiograma) {
        this.profesiograma = profesiograma;
    }

    public Long getCodigoCar() {
        return codigoCar;
    }

    public void setCodigoCar(Long codigoCar) {
        this.codigoCar = codigoCar;
    }

    public String getDescripcionActprof() {
        return descripcionActprof;
    }

    public void setDescripcionActprof(String descripcionActprof) {
        this.descripcionActprof = descripcionActprof;
    }

    public LocalDateTime getCreacionActprof() {
        return creacionActprof;
    }

    public void setCreacionActprof(LocalDateTime creacionActprof) {
        this.creacionActprof = creacionActprof;
    }

    public LocalDateTime getActualizacionActprof() {
        return actualizacionActprof;
    }

    public void setActualizacionActprof(LocalDateTime actualizacionActprof) {
        this.actualizacionActprof = actualizacionActprof;
    }

    public Long getCreacionUsu() {
        return creacionUsu;
    }

    public void setCreacionUsu(Long creacionUsu) {
        this.creacionUsu = creacionUsu;
    }

    public Long getActualizacionUsu() {
        return actualizacionUsu;
    }

    public void setActualizacionUsu(Long actualizacionUsu) {
        this.actualizacionUsu = actualizacionUsu;
    }
}