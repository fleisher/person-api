package com.example.person;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
    @Override
    public List<Person> getAllPersons() {
        // Получение списка персон
        List<Person> personsList = new ArrayList<>();
        personsList.add(new Person(1L, "Tom", 20));
        personsList.add(new Person(2L, "Andry", 30));
        personsList.add(new Person(3L, "Bob", 25));
        return personsList;
    }
}
