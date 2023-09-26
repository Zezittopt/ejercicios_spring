package com.ejercicio.controller;

@RestController
@RequestMapping("/curso")
public class CursoController {

    @Autowired
    private CursoRepository cursoRepository;

    
    /** 
     * @param curso
     * @return List<Curso>
     */
    @PostMapping(value="/alta", consumes=MediaType.APPLICATION_JSON_VALUE)
    public List<Curso> altaCurso(@RequestBody Curso curso) {
        cursoRepository.save(curso);
        return cursoRepository.findAll();
    }

    
    /** 
     * @param codigoCurso
     * @return List<Curso>
     */
    @DeleteMapping(value="/eliminacion/{codigoCurso}", produces=MediaType.APPLICATION_JSON_VALUE)
    public List<Curso> eliminarCurso(@PathVariable String codigoCurso) {
        cursoRepository.deleteByCodigoCurso(codigoCurso);
        return cursoRepository.findAll();
    }

    
    /** 
     * @param codigoCurso
     * @return Curso
     */
    @GetMapping(value="/buscar/{codigoCurso}", produces=MediaType.APPLICATION_JSON_VALUE)
    public Curso buscarCurso(@PathVariable String codigoCurso) {
        return cursoRepository.findByCodigoCurso(codigoCurso)
                .orElseThrow(() -> new NotFoundException("Curso no encontrado"));
    }

    
    /** 
     * @param codigoCurso
     * @param duracion
     */
    @PutMapping(value="/actualizacion/{codigoCurso}", consumes=MediaType.APPLICATION_JSON_VALUE)
    public void actualizarDuracion(@PathVariable String codigoCurso, @RequestParam int duracion) {
        Curso curso = cursoRepository.findByCodigoCurso(codigoCurso)
                .orElseThrow(() -> new NotFoundException("Curso no encontrado"));
        curso.setDuracion(duracion);
        cursoRepository.save(curso);
    }
}

