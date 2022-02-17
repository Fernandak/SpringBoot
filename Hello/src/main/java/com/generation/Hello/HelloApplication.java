package com.generation.Hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@RestController
@RequestMapping("/Hello")
public class HelloApplication {
	@GetMapping("/idx")
	public String index() {
		return "Persistência e proatividade!";
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);


	}

}
