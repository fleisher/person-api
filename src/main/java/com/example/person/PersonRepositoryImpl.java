package com.example.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class PersonRepositoryImpl implements PersonRepository{

    private PersonDao personDao;

    @Autowired
    public PersonRepositoryImpl(PersonDao personDao) {
        this.personDao = personDao;
    }

    @Override
    public Optional<Person> getPersonById(Long id) {
        return personDao.getPersonById(id);
    }

    @Override
    public List<Person> getAllPersons() {
        return personDao.getPersonsList();
    }

    @Override
    public Person createPerson(Person person) {
        return personDao.addPerson(person);
    }
}
