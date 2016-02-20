package info.ernestas.simple.springexample.core.dao.impl;

import info.ernestas.simple.springexample.core.dao.PersonDao;
import info.ernestas.simple.springexample.core.dao.repository.PersonRepository;
import info.ernestas.simple.springexample.core.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonDaoImpl implements PersonDao {

    @Autowired
    private PersonRepository personRepository;

    @Override
    @Cacheable("namesCache")
    public List<Person> findAll() {
        return personRepository.findAll();
    }

    @Override
    public Person findByIdAndName(Integer id, String name) {
        return personRepository.findByIdAndName(id, name);
    }

}
