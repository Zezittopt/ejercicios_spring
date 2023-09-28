package com.claudio.controller;

@RestController
@RequestMapping("/api/peliculas")
public class PeliculaController {

    @Autowired
    private PeliculaService peliculaService;

    
    /** 
     * @return ResponseEntity<String>
     */
    @PostMapping("/crear-instances")
    public ResponseEntity<String> crearInstanciasDePeliculas() {
        peliculaService.crearInstanciasDePeliculas();
        return ResponseEntity.ok("Instancias de películas creadas exitosamente");
    }

}

