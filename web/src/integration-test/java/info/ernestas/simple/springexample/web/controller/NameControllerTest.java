package info.ernestas.simple.springexample.web.controller;

import info.ernestas.simple.springexample.core.builder.NameBuilder;
import info.ernestas.simple.springexample.core.dao.repository.NameRepository;
import info.ernestas.simple.springexample.core.model.Name;
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

public class NameControllerTest extends AbstractIntegrationTest {

    @Autowired
    private NameRepository nameRepository;

    @Before
    public void setUp() {
        super.setUp();

        Name john = NameBuilder.init().withId(null).build();
        Name jane = NameBuilder.init().withId(null).withName("Suzi").build();

        nameRepository.save(john);
        nameRepository.save(jane);
    }

    @Test
    public void testGetAllNames() throws Exception {
        mockMvc.perform(get("/names/getallnames")
            .accept(MediaType.TEXT_HTML))
            .andExpect(status().isOk())
            .andExpect(view().name("names"))
            .andExpect(forwardedUrl("/WEB-INF/pages/names.jsp"))
            .andExpect(model().attribute("names", hasSize(2)));
    }

}
