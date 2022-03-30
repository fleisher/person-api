package com.example.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public List<Person> getAllPersons() {
        return personRepository.getAllPersons();
    }

    @Override
    public Person createPerson(Person person) {
        return personRepository.createPerson(person);
    }

    @Override
    public Optional<Person> getPerson(Long id) {
        return personRepository.getPerson(id);
    }

}
