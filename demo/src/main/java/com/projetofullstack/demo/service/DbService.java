package com.projetofullstack.demo.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetofullstack.demo.domain.Todo;
import com.projetofullstack.demo.repository.TodoRepository;

@Service
public class DbService {

	@Autowired
	private TodoRepository todoRepository;

	public void InstanciaBaseDeDados() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Todo t1 = new Todo(null, "Estudar", "Estudar Spring Boot 2 e Angular 11", sdf.parse("25/03/2022"), false);
		Todo t2 = new Todo(null, "Ler", "Ler livro de desenvolvimento pessoal", sdf.parse("22/03/2021"), true);
        Todo t3 = new Todo(null, "Exercicios", "Praticar exercicios fisicos", sdf.parse("21/03/2022"), false);
        Todo t4 = new Todo(null, "Meditar", "Meditar durante 30 minutos pela manhã", sdf.parse("27/03/2022"), false);
        Todo t5 = new Todo(null, "Correr", "Correr 20 kilometros ", sdf.parse("27/09/2022"), false);
        Todo t6 = new Todo(null, "Trabalho", "Trabalho da faculdade para apresentar", sdf.parse("27/05/2022"), true);


        todoRepository.saveAll(Arrays.asList(t1, t2, t3, t4, t5, t6));
	}

}
