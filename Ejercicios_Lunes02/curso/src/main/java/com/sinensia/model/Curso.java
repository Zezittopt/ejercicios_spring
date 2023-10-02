package com.sinensia.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Curso {
    @Id
    private String codCurso;
    private String nombre;
    private int duracion;
    private double precio;

    // Constructores
    
    public Curso() {
    }

    public Curso(String codCurso, String nombre, int duracion, double precio) {
        this.codCurso = codCurso;
        this.nombre = nombre;
        this.duracion = duracion;
        this.precio = precio;
    }

    
    /** 
     * @return String
     */
    // Getters y Setters

    public String getCodCurso() {
        return codCurso;
    }

    
    /** 
     * @param codCurso
     */
    public void setCodCurso(String codCurso) {
        this.codCurso = codCurso;
    }

    
    /** 
     * @return String
     */
    public String getNombre() {
        return nombre;
    }

    
    /** 
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    /** 
     * @return int
     */
    public int getDuracion() {
        return duracion;
    }

    
    /** 
     * @param duracion
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    
    /** 
     * @return double
     */
    public double getPrecio() {
        return precio;
    }

    
    /** 
     * @param precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
    
}
