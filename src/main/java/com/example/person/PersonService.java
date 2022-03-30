package com.example.person;

import java.util.List;
import java.util.Optional;

public interface PersonService {

    Person createPerson(Person person);

    Optional<Person> getPersonById(Long id);

    List<Person> getAllPersons();
}
