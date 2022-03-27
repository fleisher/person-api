package com.example.person;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Component
public class PesonDAOImpl implements PersonDAO {

    private List<Person> personsList = new ArrayList<>();
    private static AtomicLong id = new AtomicLong(0);

    @Override
    public Person getPersonById(Long id) {
        return personsList.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }

    @Override
    public Long addPerson(Person person) {

        person.setId(id.getAndIncrement());
        personsList.add(person);

        return person.getId();
    }

    @Override
    public List<Person> getPersonsList() {
        return personsList;
    }
}

