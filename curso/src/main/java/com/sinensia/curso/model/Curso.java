package com.sinensia.curso.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="curso")
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codCurso == null) ? 0 : codCurso.hashCode());
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + duracion;
        long temp;
        temp = Double.doubleToLongBits(precio);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Curso other = (Curso) obj;
        if (codCurso == null) {
            if (other.codCurso != null)
                return false;
        } else if (!codCurso.equals(other.codCurso))
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (duracion != other.duracion)
            return false;
        if (Double.doubleToLongBits(precio) != Double.doubleToLongBits(other.precio))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Curso [codCurso=" + codCurso + ", nombre=" + nombre + ", duracion=" + duracion + ", precio=" + precio
                + "]";
    }

    
    
}
