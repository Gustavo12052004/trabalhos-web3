package br.com.gustavodamazio.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.gustavodamazio.model.Person;

public class PersonRepository {
	@Autowired
    private PersonRepository personRepository;

    public Person insert (Person person) {
        return personRepository.save(person);
    }
    public Person save(Person person) {
		// TODO Auto-generated method stub
		return null;
	}
	public Person update(Person objPerson) {
        return personRepository.save(objPerson);
    }
     public List<Person> findAll() {
            List<Person> person = new ArrayList<>();
            personRepository.findAll().forEach(person::add);
            return person;
     }
     public Optional<Person> findOne(Integer id) {
            return personRepository.findById(id);
     }
     public Optional<Person> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	public void remove(Integer id) {
            personRepository.deleteById(id);
     }
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}
}
