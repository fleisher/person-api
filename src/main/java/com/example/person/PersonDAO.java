package com.example.person;

import java.util.List;

public interface PersonDAO {

    Person getPersonById(Long id);

    Long addPerson(Person recource);

    List<Person> getPersonsList();
}
