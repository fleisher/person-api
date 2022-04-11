package com.example.person;

import org.springframework.stereotype.Component;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Component
public class PersonDaoImpl implements PersonDao {

    private Map<Long,Person> personHashMap = new ConcurrentHashMap<>();
    private static AtomicLong id = new AtomicLong();

    @Override
    public Person createPerson(Person person) {

        person.setId(id.getAndIncrement());

        return personHashMap.put(person.getId(), person);
    }

    @Override
    public Optional<Person> getPersonById(Long id) {
        return Optional.ofNullable(personHashMap.get(id));
    }

    @Override
    public List<Person> getPersonsAllPersons() {
        return new ArrayList<>(personHashMap.values());
    }
}

