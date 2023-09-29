package com.sinensia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long isbn;
    private String titulo;
    private String tematica;

    // Constructores

    public Libro() {
        // Constructor vacío necesario para JPA
    }

    public Libro(String titulo, String tematica) {
        this.titulo = titulo;
        this.tematica = tematica;
    }

    
    /** 
     * @return Long
     */
    // Getters y Setters

    public Long getIsbn() {
        return isbn;
    }

    
    /** 
     * @param isbn
     */
    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    /** 
     * @return String
     */
    public String getTitulo() {
        return titulo;
    }

    
    /** 
     * @param titulo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    
    /** 
     * @return String
     */
    public String getTematica() {
        return tematica;
    }

    
    /** 
     * @param tematica
     */
    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    
    /** 
     * @return String
     */
    // toString() para facilitar la depuración y pruebas

    @Override
    public String toString() {
        return "Libro{" +
                "isbn=" + isbn +
                ", titulo='" + titulo + '\'' +
                ", tematica='" + tematica + '\'' +
                '}';
    }
}

