package com.projetofullstack.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetofullstack.demo.domain.Todo;
import com.projetofullstack.demo.repository.TodoRepository;

@Service
public class TodoService {
	
	@Autowired
	private TodoRepository repository;
	
	public Todo findById(Integer id) {
		Optional<Todo> obj = repository.findById(id);
		return obj.orElse(null);
	}

	public List<Todo> finAllOpen() {
		List<Todo> list = repository.findAllOpen();
		return list;
	}

}
