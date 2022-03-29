package com.example.person;

import java.util.List;

public interface PersonDao {

    Person getPersonById(Long id);

    Person addPerson(Person recource);

    List<Person> getPersonsList();
}
