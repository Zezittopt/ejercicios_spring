package com.claudio.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pelicula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    private String titulo;
    private String nombreDelDirector;
    private int precio;
    
    public Pelicula(String titulo, String nombreDelDirector, int precio) {
        this.titulo = titulo;
        this.nombreDelDirector = nombreDelDirector;
        this.precio = precio;
    }

    public Pelicula() {
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
    public String getNombreDelDirector() {
        return nombreDelDirector;
    }

    
    /** 
     * @param nombreDelDirector
     */
    public void setNombreDelDirector(String nombreDelDirector) {
        this.nombreDelDirector = nombreDelDirector;
    }

    
    /** 
     * @return int
     */
    public int getPrecio() {
        return precio;
    }

    
    /** 
     * @param precio
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "Pelicula [codigo=" + codigo + ", titulo=" + titulo + ", nombreDelDirector=" + nombreDelDirector
                + ", precio=" + precio + "]";
    }

    
    /** 
     * @return int
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
        result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
        result = prime * result + ((nombreDelDirector == null) ? 0 : nombreDelDirector.hashCode());
        result = prime * result + precio;
        return result;
    }

    
    /** 
     * @param obj
     * @return boolean
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pelicula other = (Pelicula) obj;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        if (titulo == null) {
            if (other.titulo != null)
                return false;
        } else if (!titulo.equals(other.titulo))
            return false;
        if (nombreDelDirector == null) {
            if (other.nombreDelDirector != null)
                return false;
        } else if (!nombreDelDirector.equals(other.nombreDelDirector))
            return false;
        if (precio != other.precio)
            return false;
        return true;
    }

}

