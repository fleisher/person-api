package com.example.person;

import org.springframework.stereotype.Component;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

@Component
public class PersonDaoImpl implements PersonDao {

    private Map<Long,Person> personHashMap = new HashMap<>();
    private static AtomicLong id = new AtomicLong();

    @Override
    public Person createPerson(Person person) {

        person.setId(id.getAndIncrement());
        personHashMap.put(person.getId(), person);

        return person;
    }

    @Override
    public Optional<Person> getPersonById(Long id) {
        return Optional.ofNullable(personHashMap.get(id));
    }

    @Override
    public List<Person> getPersonsList() {
        return personHashMap.values().stream().toList();
    }
}

