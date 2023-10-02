package com.sinensia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sinensia.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, String> {
    List<Curso> findByPrecioBetween(double precioMin, double precioMax);
}

