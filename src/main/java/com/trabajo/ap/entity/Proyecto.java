
package com.trabajo.ap.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;

@Entity
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String nombre;
    
    private String descripcion;
     @Temporal(TemporalType.DATE)
    private Date inicio;
    
    private Date fin;

    public Proyecto() {
    }

    public Proyecto(String nombre, String descripcion, Date inicio, Date fin) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.inicio = inicio;
        this.fin = fin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }
    
}
