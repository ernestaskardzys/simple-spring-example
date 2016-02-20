package info.ernestas.simple.springexample.web.controller;

import info.ernestas.simple.springexample.core.builder.PersonBuilder;
import info.ernestas.simple.springexample.core.dao.repository.PersonRepository;
import info.ernestas.simple.springexample.core.model.Person;
import info.ernestas.simple.springexample.web.AbstractIntegrationTest;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

public class PersonControllerTest extends AbstractIntegrationTest {

    @Autowired
    private PersonRepository personRepository;

    @Before
    public void setUp() {
        super.setUp();

        Person john = PersonBuilder.init().withId(null).build();
        Person jane = PersonBuilder.init().withId(null).withName("Suzi").build();

        personRepository.save(john);
        personRepository.save(jane);
    }

    @Test
    public void testGetAllNames() throws Exception {
        mockMvc.perform(get("/persons/all")
            .accept(MediaType.TEXT_HTML))
            .andExpect(status().isOk())
            .andExpect(view().name("persons"))
            .andExpect(forwardedUrl("/WEB-INF/pages/persons.jsp"))
            .andExpect(model().attribute("persons", hasSize(2)));
    }

}
