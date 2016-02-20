package info.ernestas.simple.springexample.core.dao;

import info.ernestas.simple.springexample.core.builder.PersonBuilder;
import info.ernestas.simple.springexample.core.config.TestConfiguration;
import info.ernestas.simple.springexample.core.dao.repository.PersonRepository;
import info.ernestas.simple.springexample.core.model.Person;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestConfiguration.class)
@Transactional
public class PersonDaoTest {

    private Person john;
    private Person jane;

    @Autowired
    private PersonDao personDao;

    @Autowired
    private PersonRepository personRepository;

    @Before
    public void setUp() {
        john = PersonBuilder.init().withId(null).build();
        jane = PersonBuilder.init().withId(null).withName("Jane").build();

        personRepository.save(john);
        personRepository.save(jane);
    }

    @Test
    public void testFindAllEntries() {
        List<Person> persons = personDao.findAll();

        assertEquals(2, persons.size());
    }

    @Test
    public void testFindByIdAndName() {
        Person result = personDao.findByIdAndName(jane.getId(), jane.getName());

        assertNotNull(result);
    }

}
