package info.ernestas.simple.springexample.core.dao;

import info.ernestas.simple.springexample.core.config.TestConfiguration;
import info.ernestas.simple.springexample.core.model.Name;
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

    @Test
    public void testFindAllEntries() {
        List<Name> names = nameDao.findAll();

        assertEquals(2, names.size());
    }

}
