package io.compchap.springboots.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.compchap.springboots.model.ToDo;
import io.compchap.springboots.repository.ToDoRepository;

@Service
public class ToDoService {

	@Autowired
	private ToDoRepository tr;

	
	public List<ToDo> todo;

	// Arrays.asList() creates an immutable list
	// new ArrayList<>(Arrays.asList()) - create a copy of List
	/*private List<ToDo> todo = new ArrayList<>(Arrays.asList(
			new ToDo("1","Finish the Springboot course", "In Progress", "08-01-2017"),
			new ToDo("2","Work on google quiz", "New", "08-01-2017"),
			new ToDo("3","Practice EPI", "In Progress", "08-01-2017"),
			new ToDo("4","Learn Design of high scale systems", "New", "08-01-2017")
			
			));
	*/	

	public List<ToDo> getAllTodo(){
		todo = tr.findAll();
//		todo = tr.findAll()
//				.forEach(todo::add);
		return todo;
	}
	
	public ToDo getTodo(String id){
		todo = tr.findAll();
		return todo.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}
	
	public void addTodo(ToDo t){
	//		todo.add(t);
		tr.save(t);
	}

	public void updateTodo(ToDo to, String id) {
		// TODO Auto-generated method stub
		todo = tr.findAll();
		for(int i = 0; i < todo.size(); i++){
			ToDo t = todo.get(i);
			if(t.getId().equals(id)){
				todo.set(i, to);
				tr.save(todo);
				return;
			}
		}
			
	}

	public void deleteTodo(String id) {
		// TODO Auto-generated method stub
//		todo.removeIf(t -> t.getId().equals(id));
		tr.delete(id);
		// (t -> t.getId().equals(id));
	}
	

}
