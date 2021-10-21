package br.com.gustavodamazio.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.gustavodamazio.model.Person;

@SpringBootApplication
public class PersonController {
	public static void main(String[] args) {
        SpringApplication.run(Person.class, args);
    }

}
