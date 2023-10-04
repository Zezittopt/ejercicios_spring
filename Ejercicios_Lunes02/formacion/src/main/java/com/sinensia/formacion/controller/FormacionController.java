package com.sinensia.formacion.controller;

import com.sinensia.formacion.model.Formacion;
import com.sinensia.formacion.service.FormacionService;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
public class FormacionController {

    private FormacionService service;

    public void FormacionRestController(FormacionService service) {
		this.service = service;
	}

    @GetMapping(value = "formacion", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> mostrarFormaciones() {

		ResponseEntity<?> listaFormacionesResponse = service.devolverListaCursos();
		
		if (listaFormacionesResponse.getStatusCode() == HttpStatus.OK) {
			return ResponseEntity.ok(listaFormacionesResponse);
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("ERROR");
		}

	}

    @PostMapping(value = "formacion", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> darAltaCurso(@RequestBody Formacion formacion){
        ResponseEntity<?> respuesta = service.darAltaCurso(formacion);

         if (respuesta.getStatusCode() == HttpStatus.NO_CONTENT) {
            return ResponseEntity.ok("Exito.");
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error.");
        }
    }
}
