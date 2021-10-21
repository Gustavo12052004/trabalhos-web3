package br.com.gustavodamazio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.gustavodamazio.model.Person;
import br.com.gustavodamazio.service.PersonService;

public class PersonController {
	@Autowired
    private PersonService personService;

    @GetMapping("/forminsert")
    public String insert(Model model) {
        List<Person> person = personService.findAll();
        model.addAttribute("persons", person);
        return "person/list";

    }
    @GetMapping("/list")
    public String list(Model model) {
        List<Person> person = personService.findAll();
        model.addAttribute("person", person);
        return "personagens/list";
    }
    @PostMapping("/insert")
    public String insert(@ModelAttribute("person")Person person) {
        Person resultPerson = personService.insert(person);
        if (resultPerson != null) {
            return "/list";
        }
        return "person/error";
    }
}
