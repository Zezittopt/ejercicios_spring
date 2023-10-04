package com.sinensia.curso.service;

import java.util.List;

import com.sinensia.curso.model.Curso;

public interface CursoService {
    
    public List<Curso> cursos();
    public Curso cursoConCodCurso(String codCurso);
    public List<Curso> cursoPorPrecio(double precioMin, double precioMax);
    public Curso nuevoCurso(Curso curso);
    public void borrarCurso(String codCurso);
    public void cursoDuracion(String codCurso, int nuevaDuracion);
}
