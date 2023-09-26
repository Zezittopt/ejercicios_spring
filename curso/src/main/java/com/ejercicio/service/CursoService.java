package com.ejercicio.service;


public interface CursoService {
    
    List<Curso> altaCurso(Curso curso);
    List<Curso> eliminarCurso(String codigoCurso);
    Curso<Curso> buscarCurso(String codigoCurso);
    void actualizarDuracion(String codigoCurso, int nuevaDuracion);
}

