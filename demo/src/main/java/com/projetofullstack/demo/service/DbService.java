package com.projetofullstack.demo.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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

		Todo t1 = new Todo(null, "Estudar", "Estudar mais sobre TI", sdf.parse("31/12/2021"), true);
		Todo t2 = new Todo(null, "Jogar", "Jogar com meu time de futebol", sdf.parse("12/12/2021"), true);
        Todo t3 = new Todo(null, "Controlar", "Fazer exames regularmente", sdf.parse("30/03/2022"), false);
        Todo t4 = new Todo(null, "Projeto", "Completar o projeto dos afazeres", sdf.parse("20/10/2021"), false);
        Todo t5 = new Todo(null, "Correr", "Correr 10 kilometros ", sdf.parse("31/12/2021"), true);
        Todo t6 = new Todo(null, "Emprego", "Arrumar emprego na área de TI", sdf.parse("30/01/2022"), false);
        Todo t7 = new Todo(null, "Sonho", "Comprar meu sitio", sdf.parse("31/12/2025"), false);
        Todo t8 = new Todo(null, "Investimento", "Fazer investimentos a longo prazo", sdf.parse("31/12/2030"), false);
        Todo t9 = new Todo(null, "Ajudar", "Ajudar meus pais com a reforma da casa", sdf.parse("26/02/2022"), false);
        Todo t10 = new Todo(null, "Emagrecer", "Emagrecer para melhorar a saúde", sdf.parse("30/01/2022"), false);

        todoRepository.saveAll(Arrays.asList(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10)); 
	}

}
