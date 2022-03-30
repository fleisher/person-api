package com.example.person;

import java.util.List;
import java.util.Optional;

public interface PersonDao {

    Optional<Person> getPerson(Long id);

    Person addPerson(Person person);

    List<Person> getPersonsList();
}
