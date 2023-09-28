package com.curso.service;

import com.curso.model.Curso;
import com.curso.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursoService {

    private final CursoRepository cursoRepository;

    @Autowired
    public CursoService(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    public Curso encontrarCursoPorCodigo(Long codigoCurso) {
        return cursoRepository.encontrarCursoPorCodigo(codigoCurso);
    }

    public List<Curso> obtenerTodosLosCursos() {
        return cursoRepository.findAll();
    }

    public Curso obtenerCursoPorNombre(String nombre) {
        return cursoRepository.encontrarCursoPorNombre(nombre);
    }

    public Curso guardarCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    public void eliminarCurso(Long codigoCurso) {
        cursoRepository.eliminarPorCodigo(codigoCurso);
    }
}
