package info.ernestas.simple.springexample.core.dao;

import info.ernestas.simple.springexample.core.model.Person;

import java.util.List;

public interface PersonDao {

    List<Person> findAll();

    Person findByIdAndName(Integer id, String name);

}
