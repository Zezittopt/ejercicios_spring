package com.sinensia.formacion.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.sinensia.formacion.mapper.FormacionMapper;
import com.sinensia.formacion.model.Curso;
import com.sinensia.formacion.model.Formacion;

@Service
public class FormacionServiceImpl implements FormacionService {

	private WebClient cursoWebClient;
	private FormacionMapper mapper;

	public FormacionServiceImpl(WebClient cursoWebClient, FormacionMapper mapper) {
		this.cursoWebClient = cursoWebClient;
		this.mapper = mapper;
	}

	@Override
	public ResponseEntity<?> devolverListaCursos() {
		
		ResponseEntity<List<Curso>> listCursosResponse = cursoWebClient.get()
				.uri("/curso").accept(MediaType.APPLICATION_JSON).retrieve()
                .toEntityList(Curso.class).block();

        List<Curso> listaCursos = listCursosResponse.getBody();
        List<Formacion> listaFormaciones = mapper.toFormacionList(listaCursos);

        return ResponseEntity.ok(listaFormaciones);
	}

	@Override
	public ResponseEntity<?> darAltaCurso(Formacion formacion) {
		ResponseEntity<List<Curso>> listaCursoResponse = cursoWebClient.get().uri("/curso")
				.accept(MediaType.APPLICATION_JSON).retrieve().toEntityList(Curso.class)
				.block();

        List<Curso> listaCursos = listaCursoResponse.getBody();
        for (Curso c : listaCursos) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("");
        }

        Curso curso = mapper.toCurso(formacion);
        cursoWebClient.post().uri("curso").bodyValue(curso).retrieve().toBodilessEntity().block();
        return ResponseEntity.noContent().build();

	}


}
