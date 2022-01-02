package com.felipefelix.personAPI.controller;

import com.felipefelix.personAPI.dto.request.PersonDTO;
import com.felipefelix.personAPI.entity.Person;
import com.felipefelix.personAPI.response.MessageResponseDTO;
import com.felipefelix.personAPI.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    private PersonService personService;

    @Autowired(required = true)
    public PersonController(PersonService personService) {
        this.personService = personService;
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody @Valid PersonDTO personDTO) {
        return personService.createPerson(personDTO);
            }
            @GetMapping
            public List<PersonDTO> listAll(){

            return personService.listAll();

            }

}