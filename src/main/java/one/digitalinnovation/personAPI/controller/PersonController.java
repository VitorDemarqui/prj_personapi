package one.digitalinnovation.personAPI.controller;

import one.digitalinnovation.personAPI.dto.request.PersonDTO;
import one.digitalinnovation.personAPI.dto.response.MessageResponseDTO;
import one.digitalinnovation.personAPI.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


//SERVE PRA COTROLAR AS ENTRADAS
//indica onde sera visto no site
@RestController
@RequestMapping("/api/v1/people")
public class PersonController{

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService){
        this.personService = personService;
    }

    //criacao de um livro
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody @Valid PersonDTO personDTO){ /*valida pela DTO*/
        return personService.createPerson(personDTO);
    }


}
