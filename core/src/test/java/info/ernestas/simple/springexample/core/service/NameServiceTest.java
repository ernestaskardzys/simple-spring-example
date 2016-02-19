package info.ernestas.simple.springexample.core.service;

import info.ernestas.simple.springexample.core.dao.NameDao;
import info.ernestas.simple.springexample.core.model.Name;
import info.ernestas.simple.springexample.core.service.impl.NameServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.test.util.ReflectionTestUtils.setField;

@RunWith(MockitoJUnitRunner.class)
public class NameServiceTest {

    private NameService nameService;

    @Before
    public void setUp() {
        nameService = new NameServiceImpl();

        NameDao nameDao = mock(NameDao.class);
        when(nameDao.findAll()).thenReturn(getMockNamesList());

        setField(nameService, "nameDao", nameDao);
    }

    @Test
    public void testFindAllNames() {
        List<Name> results = nameService.findAllNames();

        assertEquals(2, results.size());

        Name john = results.get(0);
        assertTrue(john.getId().equals(1));
        assertEquals("John Doe", john.getName());

        Name betty = results.get(1);
        assertTrue(betty.getId().equals(2));
        assertEquals("Betty Jones", betty.getName());
    }

    private List<Name> getMockNamesList() {
        Name john = new Name();
        john.setId(1);
        john.setName("John Doe");

        Name betty = new Name();
        betty.setId(2);
        betty.setName("Betty Jones");

        List<Name> names = new ArrayList<>();
        names.add(john);
        names.add(betty);

        return names;
    }

}
