package com.claudio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PeliculaRepository extends JpaRepository<Pelicula, Long> {

    List<Pelicula> findByNombreDelDirectorStartingWith(String letra);

    List<Pelicula> findByNombreDelDirector(String nombre);

    List<Pelicula> findByNombreDelDirectorIn(List<String> nombres);

    List<Pelicula> findByPrecioGreaterThanAndPrecioLessThan(int precioMayor, int precioMenor);

}

