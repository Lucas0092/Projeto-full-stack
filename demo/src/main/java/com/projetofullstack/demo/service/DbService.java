package com.projetofullstack.demo.service;

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

	public void InstanciaBaseDeDados() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		Todo t1 = new Todo(null, "Estudar", "Estudar Spring Boot 2 e Angular 11", LocalDateTime.parse("25/03/2022 10:40", formatter), false);
		Todo t2 = new Todo(null, "Ler", "Ler livro de desenvolvimento pessoal", LocalDateTime.parse("22/03/2021 11:00", formatter), true);
        Todo t3 = new Todo(null, "Exercicios", "Praticar exercicios fisicos", LocalDateTime.parse("21/03/2022 09:00", formatter), false);
        Todo t4 = new Todo(null, "Meditar", "Meditar durante 30 minutos pela manhã", LocalDateTime.parse("27/03/2022 08:00", formatter), false);
        Todo t5 = new Todo(null, "Correr", "Correr 20 kilometros ", LocalDateTime.parse("27/09/2022 12:00", formatter), false);
        Todo t6 = new Todo(null, "Trabalho", "Trabalho da faculdade para apresentar", LocalDateTime.parse("27/05/2022 13:00", formatter), true);


        todoRepository.saveAll(Arrays.asList(t1, t2, t3, t4, t5, t6));
	}

}
