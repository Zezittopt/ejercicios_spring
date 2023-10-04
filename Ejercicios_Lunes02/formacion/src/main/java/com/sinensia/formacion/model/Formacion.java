package com.sinensia.formacion.model;

public class Formacion {
    private String curso;
    private int asignaturas;
    private int precio;

    // Constructores, getters y setters

    public Formacion() {
        super();
    }

    public Formacion(String curso, int asignaturas, int precio) {
        super();
        this.curso = curso;
        this.asignaturas = asignaturas;
        this.precio = precio;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(int asignaturas) {
        this.asignaturas = asignaturas;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((curso == null) ? 0 : curso.hashCode());
        result = prime * result + asignaturas;
        result = prime * result + precio;
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
        Formacion other = (Formacion) obj;
        if (curso == null) {
            if (other.curso != null)
                return false;
        } else if (!curso.equals(other.curso))
            return false;
        if (asignaturas != other.asignaturas)
            return false;
        if (precio != other.precio)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Formacion [curso=" + curso + ", asignaturas=" + asignaturas + ", precio=" + precio + "]";
    }

    
}

