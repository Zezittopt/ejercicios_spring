package com.sinensia.service;

import com.sinensia.model.Libro;

public interface LibroService {

    List<Libro> obtenerLibros();

    Libro obtenerLibroPorIsbn(Long isbn);

    Libro agregarLibro(Libro libro);

    Libro actualizarLibro(Long isbn, Libro libro);

    void eliminarLibro(Long isbn);
}