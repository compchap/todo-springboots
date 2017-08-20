package io.compchap.springboots.controller;

import io.compchap.springboots.service.*;
import io.compchap.springboots.model.*;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToDoController {
	
	@Autowired
	private ToDoService todoService;
	
	@RequestMapping("/todo")
	public List<ToDo> getAllTodo(){
		return todoService.getAllTodo();
	}

	@RequestMapping("/todo/{id}")
	public ToDo getTodo(@PathVariable String id){
		return todoService.getTodo(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/todo")
	public void addTodo(@RequestBody ToDo todo){
		todoService.addTodo(todo);
	}

	@RequestMapping(method=RequestMethod.PUT, value="/todo/{id}")
	public void updateTodo(@RequestBody ToDo todo, @PathVariable String id){
		todoService.updateTodo(todo, id);
	}

	@RequestMapping(method=RequestMethod.DELETE, value="/todo/{id}")
	public void deleteTodo(@PathVariable String id){
		todoService.deleteTodo(id);
	}
	
}
