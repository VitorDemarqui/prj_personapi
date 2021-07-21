package one.digitalinnovation.personAPI.service;

import one.digitalinnovation.personAPI.dto.MessageResponseDTO;
import one.digitalinnovation.personAPI.entity.Person;
import one.digitalinnovation.personAPI.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//diz que vai tratar uma classe onde vai conter as regras de negocio
@Service
public class PersonService {

    private PersonRepository personRepository;


    //indica que o spring deve usar um contrato tipo repository
    @Autowired
    public PersonService(PersonRepository personRepository){
        this.personRepository = personRepository;
    }


    //criacao de um livro
    public MessageResponseDTO createPerson(Person person){
        Person savedPerson = personRepository.save(person);
        return MessageResponseDTO
                .builder()
                .message("Created person with ID " + savedPerson.getId())
                .build();
    }

}