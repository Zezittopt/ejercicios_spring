package com.sinensia.formacion.model;

public class Curso {
    
    private String codCurso;
	private String nombre;
	private int duracion; 
	private int precio; 
	
	public Curso(String codCurso, String nombre, int duracion, int precio) {
		super();
		this.codCurso = codCurso;
		this.nombre = nombre;
		this.duracion = duracion;
		this.precio = precio;
	}

	public Curso() {
		super();
	}

	public String getCodigo() {
		return codCurso;
	}

	public void setCodigo(String codigoCurso) {
		this.codCurso = codigoCurso;
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

	@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codCurso == null) ? 0 : codCurso.hashCode());
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + duracion;
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
        if (precio != other.precio)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Curso [codigo=" + codCurso + ", nombre=" + nombre + ", duracion=" + duracion + ", precio=" + precio + "]";
    }

    
}
