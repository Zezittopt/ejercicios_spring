package com.curso.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.curso.model.Libro;

@Service
public class LibrosServiceImpl implements LibrosService{
    List<Libro> libros;
    public LibrosServiceImpl(){
        libros = new ArrayList<>();
        libros.add(new Libro(111, "Java 17", "Programacion" ));
        libros.add(new Libro(121, "Java 16", "Programacion" ));
        libros.add(new Libro(131, "Java 15", "Programacion" ));
        libros.add(new Libro(141, "Java 14", "Programacion" ));

    }

    @Override 
    public List<Libro> libros() {
        return libros;
    }

    @Override
    public void actualizarLibro(Libro libro) {
        for (Libro librocomprobar: libros) {
            if (librocomprobar.getIsbn() == libro.getIsbn()) {
                // Actualiza el nombre y la temática del libro
                librocomprobar.setTitulo(libro.getTitulo());
                librocomprobar.setTematica(libro.getTematica());
                return; // Termina la iteración después de actualizar el libro
            }
        }
    }

    @Override
    public void altaLibro(Libro libro) {
        libros.add(libro);
    }

    @Override
    public Libro buscarLibro(int isbn) {
        return libros.stream()
            .filter(libro -> libro.getIsbn() == isbn)
            .findFirst()
            .orElse(null);
    }

    @Override
    public List<Libro> eliminarLibro(int isbn) {
        libros.removeIf(curso -> curso.getIsbn()==isbn);
        return libros;
    }

    
    
}
