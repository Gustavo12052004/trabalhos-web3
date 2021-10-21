package br.com.gustavodamazio.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.gustavodamazio.model.Person;
import br.com.gustavodamazio.repository.PersonRepository;

public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public Person insert (Person person) {
        return personRepository.save(person);
    }
    public Person update(Person objPerson) {
        return personRepository.save(objPerson);
    }
     public List<Person> findAll() {
            List<Person> personagens = new ArrayList<>();
            personRepository.findAll().forEach(Person::add);
            return Person;
     }
     public Optional<Person> findOne(Integer id) {
            return personRepository.findById(id);
     }
     public void remove(Integer id) {
            personRepository.deleteById(id);
   }
}
