package com.claudio.service;

import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Service
public class PeliculaService {

    @Autowired
    private PeliculaRepository peliculaRepository;

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void crearInstanciasDePeliculas() {
        // Crear instancias de películas
        Pelicula pelicula1 = new Pelicula("Braveheart", "Mel Gibson", 55);
        Pelicula pelicula2 = new Pelicula("Trainwreck", "Eva Longoria", 15);
        Pelicula pelicula3 = new Pelicula("Night in the woods", "Ana de Armas", 30);
        Pelicula pelicula4 = new Pelicula("In the hood", "Cosme", 60);

        // Guardar instancias en la base de datos
        peliculaRepository.save(pelicula1);
        peliculaRepository.save(pelicula2);
        peliculaRepository.save(pelicula3);
        peliculaRepository.save(pelicula4);
    }

    
    /** 
     * @return List<Pelicula>
     */
    public List<Pelicula> mostrarTodasLasPeliculas() {
        Query query = entityManager.createQuery("SELECT p FROM Pelicula p");
        return query.getResultList();
    }

    
    /** 
     * @return List<Pelicula>
     */
    public List<Pelicula> mostrarPeliculasConDirectorQueEmpiezaConM() {
        Query query = entityManager.createQuery("SELECT p FROM Pelicula p WHERE p.nombreDelDirector LIKE 'M%'");
        return query.getResultList();
    }

    
    /** 
     * @return List<Pelicula>
     */
    public List<Pelicula> mostrarPeliculasConDirectorCosme() {
        Query query = entityManager.createQuery("SELECT p FROM Pelicula p WHERE p.nombreDelDirector = 'Cosme'");
        return query.getResultList();
    }

    
    /** 
     * @return List<Pelicula>
     */
    public List<Pelicula> mostrarPeliculasConDirectoresAnaOEva() {
        Query query = entityManager.createQuery("SELECT p FROM Pelicula p WHERE p.nombreDelDirector IN ('Ana', 'Eva')");
        return query.getResultList();
    }

    
    /** 
     * @return List<String>
     */
    public List<String> mostrarSoloDirectores() {
        Query query = entityManager.createQuery("SELECT DISTINCT p.nombreDelDirector FROM Pelicula p");
        return query.getResultList();
    }

    
    /** 
     * @return List<Pelicula>
     */
    public List<Pelicula> mostrarPeliculasConPrecioEntre20Y55() {
        Query query = entityManager.createQuery("SELECT p FROM Pelicula p WHERE p.precio > 20 AND p.precio < 55");
        return query.getResultList();
    }

}

