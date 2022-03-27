package com.example.person;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    public PersonServiceImpl(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    final private PersonDAO personDAO;

    @Override
    public List<Person> getAllPersons() {
        return personDAO.getPersonsList();
    }

    @Override
    public Person postPerson(Person person) {
        personDAO.addPerson(person);
        return person;
    }

    @Override
    public Person getPerson(Long id) {
        return personDAO.getPersonById(id);
    }

}
