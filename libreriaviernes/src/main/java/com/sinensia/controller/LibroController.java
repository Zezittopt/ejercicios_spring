package com.sinensia.controller;

import com.sinensia.model.Libro;
import com.sinensia.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;

import java.util.List;

@RestController
@RequestMapping("/libros")
public class LibroController {

    @Autowired
    private LibroRepository libroRepository;

    
    /** 
     * @return List<Libro>
     */
    @GetMapping(value="/libreria", produces=MediaType.APPLICATION_JSON_VALUE)
    public List<Libro> obtenerLibros() {
        return libroRepository.findAll();
    }

    
    /** 
     * @param isbn
     * @return Libro
     */
    @GetMapping(value="/libreria/libro/{isbn}", produces=MediaType.APPLICATION_JSON_VALUE)
    public Libro obtenerLibroPorIsbn(@PathVariable Long isbn) {
        return libroRepository.findById(isbn).orElse(null);
    }

    
    /** 
     * @param libro
     * @return Libro
     */
    @PostMapping(value="/libreria/agregar", consumes=MediaType.APPLICATION_JSON_VALUE)
    public Libro agregarLibro(@RequestBody Libro libro) {
        return libroRepository.save(libro);
    }

    
    /** 
     * @param isbn
     * @param libro
     * @return Libro
     */
    @PutMapping(value="/libreria/actualizar/{isbn}", consumes=MediaType.APPLICATION_JSON_VALUE)
    public Libro actualizarLibro(@PathVariable Long isbn, @RequestBody Libro libro) {
        libro.setIsbn(isbn);
        return libroRepository.save(libro);
    }

    @DeleteMapping(value="/libreria/eliminar/{isbn}", consumes=MediaType.APPLICATION_JSON_VALUE)
    public void eliminarLibro(@PathVariable Long isbn) {
        libroRepository.deleteById(isbn);
    }
}
