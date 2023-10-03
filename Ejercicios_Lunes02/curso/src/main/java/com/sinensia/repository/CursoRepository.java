package com.sinensia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sinensia.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, String> {
    @Query("SELECT c FROM Curso c BETWEEN :precioMin AND :precioMax")
    List<Curso> findByPrecioBetween(double precioMin, double precioMax);

    @Query("SELECT c FROM Curso)")
    List<Curso> findAll();
}

