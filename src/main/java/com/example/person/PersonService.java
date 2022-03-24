package com.example.person;

import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface PersonService {

    List<Person> getAllPersons();

    Person postPerson(Person resource);

    Person getPerson(@PathVariable("id") Long id);
}
