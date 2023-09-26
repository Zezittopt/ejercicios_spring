package com.ejercicio.model;

@Entity
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codigoCurso;
    private String nombre;
    private int duracion;
    private int precio;

    public Curso() {
    }
    
    public Curso(String codigoCurso, String nombre, int duracion, int precio) {
        this.codigoCurso = codigoCurso;
        this.nombre = nombre;
        this.duracion = duracion;
        this.precio = precio;
    }
    
    /** 
     * @return Long
     */
    public Long getId() {
        return id;
    }
    
    /** 
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }
    
    /** 
     * @return String
     */
    public String getCodigoCurso() {
        return codigoCurso;
    }
    
    /** 
     * @param codigoCurso
     */
    public void setCodigoCurso(String codigoCurso) {
        this.codigoCurso = codigoCurso;
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

}

