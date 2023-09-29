package com.sinensia.service;

import com.sinensia.model.Libro;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class LibroServiceImpl implements LibroService {

    @Value("${libreria.datos.url}")
    private String libreriaDatosUrl;  // URL del servicio LibreriaDatos

    private final RestTemplate restTemplate;

    public LibroServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    
	/** 
	 * @return List<Libro>
	 */
	@Override
    public List<Libro> obtenerLibros() {
        String url = libreriaDatosUrl + "/libros";
        Libro[] libros = restTemplate.getForObject(url, Libro[].class);
        return libros != null ? Arrays.asList(libros) : null;
    }

    
	/** 
	 * @param isbn
	 * @return Libro
	 */
	@Override
    public Libro obtenerLibroPorIsbn(Long isbn) {
        String url = libreriaDatosUrl + "/libros/" + isbn;
        return restTemplate.getForObject(url, Libro.class);
    }

    
	/** 
	 * @param libro
	 * @return Libro
	 */
	@Override
    public Libro agregarLibro(Libro libro) {
        String url = libreriaDatosUrl + "/libros";
        return restTemplate.postForObject(url, libro, Libro.class);
    }

    
	/** 
	 * @param isbn
	 * @param libro
	 * @return Libro
	 */
	@Override
    public Libro actualizarLibro(Long isbn, Libro libro) {
        String url = libreriaDatosUrl + "/libros/" + isbn;
        restTemplate.put(url, libro);
        return libro;
    }

    
	/** 
	 * @param isbn
	 */
	@Override
    public void eliminarLibro(Long isbn) {
        String url = libreriaDatosUrl + "/libros/" + isbn;
        restTemplate.delete(url);
    }
}
