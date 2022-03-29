package com.example.person;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Component
public class PersonDaoImpl implements PersonDao {

    private List<Person> personsList = new ArrayList<>();
    private static AtomicLong id = new AtomicLong();

    @Override
    public Person getPersonById(Long id) {

        for(Person item : personsList) {
            if (item.getId() == id) return item;
        }
        return null;
    }

    @Override
    public Person addPerson(Person person) {

        person.setId(id.getAndIncrement());
        personsList.add(person);

        return person;
    }

    @Override
    public List<Person> getPersonsList() {
        return personsList;
    }
}

