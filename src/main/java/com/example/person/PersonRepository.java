package com.example.person;

import java.util.List;
import java.util.Optional;

public interface PersonRepository {

    Optional<Person> getPerson(Long id);
    List<Person> getAllPersons();
    Person createPerson(Person person);
}
