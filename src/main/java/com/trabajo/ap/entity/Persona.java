
package com.trabajo.ap.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;

@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int id;
    
    private String nombre;
    
    private String apellido;
    
    private int edad;
    
    @Temporal(TemporalType.DATE)
    private Date nacimiento;
    
    @Lob
    private String acercade;
    private String imagen;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, Date nacimiento, String acercade, String imagen) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.nacimiento= nacimiento;
        this.acercade = acercade;
        this.imagen = imagen;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getAcercade() {
        return acercade;
    }

    public void setAcercade(String acercade) {
        this.acercade = acercade;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
    
}
