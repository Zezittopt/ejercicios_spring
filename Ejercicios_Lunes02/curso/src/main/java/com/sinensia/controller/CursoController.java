package com.sinensia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.sinensia.model.Curso;
import com.sinensia.service.CursoService;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    @Autowired
    private CursoService cursoService;

    
    /** 
     * @return List<Curso>
     */
    @GetMapping
    public List<Curso> getAllCursos() {
        return cursoService.getAllCursos();
    }

    
    /** 
     * @param codCurso
     * @return ResponseEntity<Curso>
     */
    @GetMapping("curso/{codCurso}")
    public ResponseEntity<Curso> getCursoByCodCurso(@PathVariable String codCurso) {
        Curso curso = cursoService.getCursoByCodCurso(codCurso);
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
    public List<Curso> getCursosByPrecio(@RequestParam double min, @RequestParam double max) {
        return cursoService.getCursosByPrecio(min, max);
    }

    
    /** 
     * @param curso
     * @return Curso
     */
    @PostMapping
    public Curso addCurso(@RequestBody Curso curso) {
        return cursoService.addCurso(curso);
    }

    
    /** 
     * @param codCurso
     * @return ResponseEntity<String>
     */
    @DeleteMapping("curso/{codCurso}")
    public ResponseEntity<String> deleteCurso(@PathVariable String codCurso) {
        cursoService.deleteCurso(codCurso);
        return ResponseEntity.ok("Curso eliminado correctamente");
    }

    
    /** 
     * @param codCurso
     * @param duracion
     * @return ResponseEntity<String>
     */
    @PutMapping("curso/{codCurso}")
    public ResponseEntity<String> updateDuracion(@PathVariable String codCurso, @RequestParam int duracion) {
        cursoService.updateDuracion(codCurso, duracion);
        return ResponseEntity.ok("Duración actualizada correctamente");
    }
}

