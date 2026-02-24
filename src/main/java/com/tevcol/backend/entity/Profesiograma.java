package com.tevcol.backend.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "profesiograma")
public class Profesiograma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_prof")
    private Long codigoProf;

    @Column(name = "codigo_car")
    private Long codigoCar;

    @Column(name = "codigo_est")
    private Long codigoEst;

    @Column(name = "creacion_prof")
    private LocalDateTime creacionProf;

    @Column(name = "actualizacion_prof")
    private LocalDateTime actualizacionProf;

    @Column(name = "creacion_usu")
    private Long creacionUsu;

    @Column(name = "actualizacion_usu")
    private Long actualizacionUsu;

    
    

    public Long getCodigoProf() {
        return codigoProf;
    }

    public void setCodigoProf(Long codigoProf) {
        this.codigoProf = codigoProf;
    }

    public Long getCodigoCar() {
        return codigoCar;
    }

    public void setCodigoCar(Long codigoCar) {
        this.codigoCar = codigoCar;
    }

    public Long getCodigoEst() {
        return codigoEst;
    }

    public void setCodigoEst(Long codigoEst) {
        this.codigoEst = codigoEst;
    }

    public LocalDateTime getCreacionProf() {
        return creacionProf;
    }

    public void setCreacionProf(LocalDateTime creacionProf) {
        this.creacionProf = creacionProf;
    }

    public LocalDateTime getActualizacionProf() {
        return actualizacionProf;
    }

    public void setActualizacionProf(LocalDateTime actualizacionProf) {
        this.actualizacionProf = actualizacionProf;
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