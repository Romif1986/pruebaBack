
package com.trabajo.ap.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;



import java.util.Date;

@Entity
public class Experiencia {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int id;
    
     private String empresa;
     
     
     private Date fechaInicio;
     
     
     private Date fechaFin;
     @Lob
     private String descripcion;

    public Experiencia() {
    }

    public Experiencia(String empresa, Date fechaInicio, Date fechaFin, String descripcion) {
        this.empresa = empresa;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
     
     
    
}
