package com.example.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    private PersonDao personDao;

    @Autowired
    public PersonServiceImpl(PersonDao personDao) {
        this.personDao = personDao;
    }

    @Override
    public List<Person> getAllPersons() {
        return personDao.getPersonsList();
    }

    @Override
    public Person postPerson(Person person) {
        return personDao.addPerson(person);
    }

    @Override
    public Person getPerson(Long id) {
        return personDao.getPersonById(id);
    }

}
