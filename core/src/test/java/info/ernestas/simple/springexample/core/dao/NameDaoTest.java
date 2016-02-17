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
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestConfiguration.class)
@Transactional
public class NameDaoTest {

    private Name john;
    private Name jane;

    @Autowired
    private NameDao nameDao;

    @Autowired
    private NameRepository nameRepository;

    @Before
    public void setUp() {
        john = NameBuilder.init().withId(null).build();
        jane = NameBuilder.init().withId(null).withName("Jane").build();

        nameRepository.save(john);
        nameRepository.save(jane);
    }

    @Test
    public void testFindAllEntries() {
        List<Name> names = nameDao.findAll();

        assertEquals(2, names.size());
    }

    @Test
    public void testFindByIdAndName() {
        Name result = nameDao.findByIdAndName(jane.getId(), jane.getName());

        assertNotNull(result);
    }

}
