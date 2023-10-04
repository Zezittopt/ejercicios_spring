package com.sinensia.curso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.sinensia.curso.model.Curso;
import com.sinensia.curso.service.CursoServiceImpl;

import java.util.List;

@RestController
// @RequestMapping("/curso")
public class CursoController {

    @Autowired
    private CursoServiceImpl cursoService;

    
    /** 
     * @return List<Curso>
     */
    @GetMapping(value="curso", produces=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> cursos(){
		List<Curso> listaCursos = cursoService.cursos();
		return ResponseEntity.ok(listaCursos);
    }

    
    /** 
     * @param codCurso
     * @return ResponseEntity<Curso>
     */
    @GetMapping(value="curso/{codCurso}", produces=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Curso> cursoConCodCurso(@PathVariable("codCurso") String codCurso) {
        Curso curso = cursoService.cursoConCodCurso(codCurso);
        if (curso != null) {
            return ResponseEntity.ok(curso);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    
    /** 
     * @param min
     * @param max
     * @return List<Curso>
     */
    @GetMapping("curso/precio")
    public List<Curso> cursoPorPrecio(@RequestParam double min, @RequestParam double max) {
        return cursoService.cursoPorPrecio(min, max);
    }

    
    /** 
     * @param curso
     * @return Curso
     */
    @PostMapping
    public Curso nuevoCurso(@RequestBody Curso curso) {
        return cursoService.nuevoCurso(curso);
    }

    
    /** 
     * @param codCurso
     * @return ResponseEntity<String>
     */
    @DeleteMapping("curso/{codCurso}")
    public ResponseEntity<String> borrarCurso(@PathVariable String codCurso) {
        cursoService.borrarCurso(codCurso);
        return ResponseEntity.ok("Curso eliminado correctamente");
    }

    
    /** 
     * @param codCurso
     * @param duracion
     * @return ResponseEntity<String>
     */
    @PutMapping("curso/{codCurso}")
    public ResponseEntity<String> cursoDuracion(@PathVariable String codCurso, @RequestParam int duracion) {
        cursoService.cursoDuracion(codCurso, duracion);
        return ResponseEntity.ok("Duración actualizada correctamente");
    }
}

