package com.sinensia.controller;

import com.sinensia.model.Formacion;
import com.sinensia.service.FormacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/formacion")
public class FormacionController {

    @Autowired
    private FormacionService formacionService;

    @GetMapping("/formacion/cursos")
    public List<Curso> getAllCursos() {
        return formacionService.getAllCursos();
    }

    @PostMapping("/formacion/curso-alta")
    public void altaCurso(@RequestBody Formacion formacion) {
        formacionService.altaCurso(formacion);
    }
}
