package com.example.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.convert.Delimiter;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.List;
import java.util.Optional;

@Service
public class PersonServiceImpl implements PersonService {

    private PersonRepository personRepository;

    @Autowired
    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public Person createPerson(Person person) {
        return personRepository.createPerson(person);
    }

    @Override
    public Optional<Person> getPersonById(Long id) {
        return personRepository.getPersonById(id);
    }

    @Override
    public List<Person> getAllPersons() {
        return personRepository.getAllPersons();
    }

    @Override
    public Optional<Person> updatePerson(Long id, Person person) {
        return personRepository.updatePerson(id, person);
    }

    @Override
    public Optional<Person> deletePerson(Long id) {
        return personRepository.deletePerson(id);
    }

}
