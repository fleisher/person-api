package com.example.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/persons")
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Person> getAllPersons() {
        return personService.getAllPersons();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Person postPersons(@RequestBody Person resource) {
        return personService.postPerson(resource);
    }

    @GetMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Person getPerson(@PathVariable("id") Long id, HttpServletResponse response) {

        return Optional.ofNullable(personService.getPerson(id)).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

}
