package com.joshcorino.todoapp;

import com.joshcorino.todoapp.Todo;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.stream.Stream;

@SpringBootApplication
public class TodoappApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoappApplication.class, args);
	}

	@Bean
	ApplicationRunner init(TodoRepository repository) {
		return args -> {
			Stream.of("Hacer las compras", "Limpiar el banio").forEach(name -> {
				Todo todo = new Todo();
				todo.setName(name);
				todo.setDescription("Esta seria la descripcion");
				repository.save(todo);
			});
			repository.findAll().forEach(System.out::println);
		};
	}
}