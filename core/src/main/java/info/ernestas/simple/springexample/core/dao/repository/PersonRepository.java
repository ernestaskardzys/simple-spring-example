package info.ernestas.simple.springexample.core.dao.repository;

import info.ernestas.simple.springexample.core.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {

    Person findByIdAndName(Integer id, String name);

}
