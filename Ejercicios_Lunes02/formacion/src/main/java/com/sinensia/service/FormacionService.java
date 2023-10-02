package com.sinensia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sinensia.model.Formacion;
import java.util.List;

@Service
public class FormacionService {

    @Autowired
    private CursoService cursoService;

    public List<Curso> getAllCursos() {
        return cursoService.getAllCursos();
    }

    public void altaCurso(Formacion formacion) {
        // Verificar si ya existe un curso con el mismo nombre
        if (cursoService.getCursoByNombre(formacion.getCurso()) == null) {
            // Calcular la duración del curso según la fórmula: asignaturas * 10
            int duracion = formacion.getAsignaturas() * 10;

            // Crear un nuevo curso
            Curso nuevoCurso = new Curso();
            nuevoCurso.setNombre(formacion.getCurso());
            nuevoCurso.setDuracion(duracion);
            nuevoCurso.setPrecio(formacion.getPrecio());

            // Dar de alta el curso a través del microservicio de cursos
            cursoService.addCurso(nuevoCurso);
        }
        // Si el curso ya existe con el mismo nombre, no se hace nada
    }
}
