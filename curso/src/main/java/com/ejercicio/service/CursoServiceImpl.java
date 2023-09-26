package com.ejercicio.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CursoServiceImpl extends CursoService {
    private List<Curso> cursos = new ArrayList<>();

    
    /** 
     * @param curso
     * @return List<Curso>
     */
    // Alta de curso
    public List<Curso> altaCurso(Curso curso) {
        cursos.add(curso);
        return cursos;
    }

    
    /** 
     * @param codigoCurso
     * @return List<Curso>
     */
    // Eliminación de curso
    public List<Curso> eliminarCurso(String codigoCurso) {
        cursos.removeIf(curso -> curso.getCodigoCurso().equals(codigoCurso));
        return cursos;
    }

    
    /** 
     * @param codigoCurso
     * @return Curso<Curso>
     */
    // Búsqueda de curso por código
    public Curso<Curso> buscarCurso(String codigoCurso) {
        return cursos.stream()
                .filter(curso -> curso.getCodigoCurso().equals(codigoCurso))
                .findFirst();
    }

    
    /** 
     * @param codigoCurso
     * @param nuevaDuracion
     */
    // Actualización de la duración de curso
    public void actualizarDuracion(String codigoCurso, int nuevaDuracion) {
        cursos.stream()
                .filter(curso -> curso.getCodigoCurso().equals(codigoCurso))
                .findFirst()
                .ifPresent(curso -> curso.setDuracion(nuevaDuracion));
    }
}
