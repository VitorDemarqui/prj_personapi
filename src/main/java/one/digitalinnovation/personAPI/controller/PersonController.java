package one.digitalinnovation.personAPI.controller;

import one.digitalinnovation.personAPI.dto.MessageResponseDTO;
import one.digitalinnovation.personAPI.entity.Person;
import one.digitalinnovation.personAPI.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
//indica onde sera visto no site
@RequestMapping("/api/v1/people")
public class PersonController {
    private PersonRepository personRepository;

    @Autowired
    public PersonController(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    @PostMapping
    public MessageResponseDTO createPerson(@RequestBody Person person){
        personRepository.save(person);
        return MessageResponseDTO
                .builder()
                .build();
    }


}
