package com.projetofullstack.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetofullstack.demo.domain.Todo;
import com.projetofullstack.demo.repository.TodoRepository;
import com.projetofullstack.demo.service.exception.ObjectNotFoundException;



@Service
public class TodoService {
	
	@Autowired
	private TodoRepository todoRepository;
	
	public Todo findById(Integer id){
		Optional<Todo> obj = todoRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException 
				("Objeto não encontrado Id: "+id + ", Tipo: "+ Todo.class.getName()));
	}

	public List<Todo> findAllOpen() {
		List<Todo> list = todoRepository.findAllOpen();
		return list;
	}

	public List<Todo> findAllClose() {
		List<Todo> list = todoRepository.findAllClose();
		return list;
	}
	
	public List<Todo> findAll(){
		List<Todo> list = todoRepository.findAll();
		return list;
	}

	public Todo create(Todo obj) {
		obj.setId(null);
		return todoRepository.save(obj);
		
	}

	public void delete(Integer id) {
		todoRepository.deleteById(id);
		
	}

	public Todo update(Integer id, Todo obj) {
		Todo newObj = findById(id);
		newObj.setTitulo(obj.getTitulo());
		newObj.setDataParaFinalizar(obj.getDataParaFinalizar());
		newObj.setDescricao(obj.getDescricao());
		newObj.setFinalizado(obj.getFinalizado());
		return todoRepository.save(newObj);
		
	}
}