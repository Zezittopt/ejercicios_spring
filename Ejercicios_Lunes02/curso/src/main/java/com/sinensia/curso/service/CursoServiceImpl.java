package com.sinensia.curso.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinensia.curso.model.Curso;
import com.sinensia.curso.repository.CursoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CursoServiceImpl implements CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    
    /** 
     * @return List<Curso>
     */
    // Obtiene todos los cursos.
    @Override
    public List<Curso> cursos() {
        return cursoRepository.findAll();
    }

    
    /** 
     * @param codCurso
     * @return Curso
     */
    // Obtiene un curso por su código.
    @Override
    public Curso cursoConCodCurso(String codCurso) {
        Optional<Curso> cursoOptional = cursoRepository.findById(codCurso);
        return cursoOptional.orElse(null);
    }

    
    /** 
     * @param precioMin
     * @param precioMax
     * @return List<Curso>
     */
    // Obtiene cursos en un rango de precios.
    @Override
    public List<Curso> cursoPorPrecio(double precioMin, double precioMax) {
        return cursoRepository.findByPrecioBetween(precioMin, precioMax);
    }

    
    /** 
     * @param curso
     * @return Curso
     */
    // Agrega un nuevo curso.
    @Override
    public Curso nuevoCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    
    /** 
     * @param codCurso
     */
    // Elimina un curso por su código.
    @Override
    public void borrarCurso(String codCurso) {
        cursoRepository.deleteById(codCurso);
    }

    
    /** 
     * @param codCurso
     * @param nuevaDuracion
     */
    // Actualiza la duración de un curso por su código.
    @Override
    public void cursoDuracion(String codCurso, int nuevaDuracion) {
        Optional<Curso> cursoOptional = cursoRepository.findById(codCurso);
        if (cursoOptional.isPresent()) {
            Curso curso = cursoOptional.get();
            curso.setDuracion(nuevaDuracion);
            cursoRepository.save(curso);
        }
    }
}

