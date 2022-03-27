package com.example.person;

import java.util.List;

public interface PersonService {

    List<Person> getAllPersons();

    Person postPerson(Person person);

    Person getPerson(Long id);
}
