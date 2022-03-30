package com.example.person;

import java.util.List;
import java.util.Optional;

public interface PersonService {

    List<Person> getAllPersons();

    Person createPerson(Person person);

    Optional<Person> getPersonById(Long id);
}
