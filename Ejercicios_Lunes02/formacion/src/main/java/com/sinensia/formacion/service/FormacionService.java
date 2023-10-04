package com.sinensia.formacion.service;

import org.springframework.http.ResponseEntity;

import com.sinensia.formacion.model.Formacion;

public interface FormacionService {

	public ResponseEntity<?> devolverListaCursos();
	public ResponseEntity<?> darAltaCurso(Formacion formacion);
}

