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
    public List<Person> getAllPersons() {
        return new ArrayList<>(personHashMap.values());
    }

    @Override
    public Optional<Person> updatePerson(Long id, Person person) {
        return Optional.ofNullable(personHashMap.replace(id, person));
    }

    @Override
    public Optional<Person> deletePerson(Long id) {
       return Optional.ofNullable(personHashMap.remove(id));
    }
}

