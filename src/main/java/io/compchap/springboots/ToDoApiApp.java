package io.compchap.springboots;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ToDoApiApp{
	
/*	@Autowired
	private ToDoRepository todo;*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(ToDoApiApp.class, args);
	}
	
/*	@Override
	public void run(String... args) throws Exception{
		
		todo.deleteAll();
		
		todo.save(new ToDo("1","Finish the Springboot course", "In Progress", "08-01-2017"));
		todo.save(new ToDo("2","Work on google quiz", "New", "08-01-2017"));
		todo.save(new ToDo("3","Practice EPI", "In Progress", "08-01-2017"));
		todo.save(new ToDo("4","Learn Design of high scale systems", "New", "08-01-2017"));
		
		// fetch all ToDo
		System.out.println("Todo found with findAll():");
		System.out.println("-------------------------------");
		for (ToDo td : todo.findAll()) {
			System.out.println(td);
		}
		System.out.println();	
		
		
		
	}*/
}
