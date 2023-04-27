
package com.trabajo.ap.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Redes {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
     private int id;
     
     private String nombre;
     
     private String url;
     
     private String logo;

    public Redes() {
    }

    public Redes(String nombre, String url, String logo) {
        this.nombre = nombre;
        this.url = url;
        this.logo = logo;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
     
     
}
