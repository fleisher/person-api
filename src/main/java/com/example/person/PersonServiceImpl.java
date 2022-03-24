package com.example.person;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Override
    public List<Person> getAllPersons() {
        return Person.personsList;
    }

    @Override
    public Person postPerson(Person resource) {
        resource.personsList.add(resource);
        return resource;
    }

    @Override
    public Person getPerson(@PathVariable("id") Long id) {
        return Person.getPersonById(--id);
    }
}
