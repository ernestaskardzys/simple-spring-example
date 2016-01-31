package info.ernestas.simple.springexample.core.dao;

import info.ernestas.simple.springexample.core.builder.NameBuilder;
import info.ernestas.simple.springexample.core.config.TestConfiguration;
import info.ernestas.simple.springexample.core.dao.repository.NameRepository;
import info.ernestas.simple.springexample.core.model.Name;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestConfiguration.class)
public class NameDaoTest {

    @Autowired
    private NameDao nameDao;

    @Autowired
    private NameRepository nameRepository;

    @Before
    public void setUp() {
        Name john = NameBuilder.init().withId(null).build();
        Name jane = NameBuilder.init().withId(null).withName("Suzi").build();

        nameRepository.save(john);
        nameRepository.save(jane);
    }

    @Test
    public void testFindAllEntries() {
        List<Name> names = nameDao.findAll();

        assertEquals(2, names.size());
    }

}
