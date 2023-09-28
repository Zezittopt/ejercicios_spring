package com.curso.repository;

import com.curso.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
    
    @Query("SELECT c FROM Curso c WHERE c.codigoCurso = :codigoCurso")
    Curso encontrarCursoPorCodigo(@Param("codigoCurso") Long codigoCurso);

    @Query("SELECT c FROM Curso c WHERE c.nombre = :nombre")
    Curso encontrarCursoPorNombre(@Param("nombre") String nombre);

    @Query("DELETE c FROM curso c WHERE c.codigoCurso = :codigoCurso")
    Curso eliminarPorCodigo(@Param("codigoCurso") Long codigoCurso);
}
