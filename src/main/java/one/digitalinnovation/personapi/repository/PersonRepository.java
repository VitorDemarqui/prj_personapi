package one.digitalinnovation.personapi.repository;

import one.digitalinnovation.personapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

//extende uma interface jpa que e proprio do banco de dados
public interface PersonRepository extends JpaRepository<Person, Long> {
}
