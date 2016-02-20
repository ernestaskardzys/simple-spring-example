package info.ernestas.simple.springexample.core.service.impl;

import info.ernestas.simple.springexample.core.dao.PersonDao;
import info.ernestas.simple.springexample.core.model.Person;
import info.ernestas.simple.springexample.core.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDao personDao;

    @Override
    public List<Person> findAllNames() {
        return personDao.findAll();
    }

}
