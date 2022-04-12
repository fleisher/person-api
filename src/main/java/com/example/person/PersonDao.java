package com.example.person;

import java.util.List;
import java.util.Optional;

public interface PersonDao {

    Person createPerson(Person person);

    Optional<Person> getPersonById(Long id);

    List<Person> getAllPersons();

    Optional<Person> updatePerson(Long id, Person person);

     Optional<Person> deletePerson(Long id);
}
