package com.curso.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoCurso;

    private String nombre;
    private int duracion;
    private int precio;

    public Curso() {
        // Constructor vacío requerido por JPA
    }

    public Curso(Long codigoCurso, String nombre, int duracion, int precio) {
        this.codigoCurso = codigoCurso;
        this.nombre = nombre;
        this.duracion = duracion;
        this.precio = precio;
    }

    // Getters y setters

    public Long getCodigoCurso() {
        return codigoCurso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}

