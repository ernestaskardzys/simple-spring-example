package info.ernestas.simple.springexample.web.controller;

import info.ernestas.simple.springexample.web.AbstractIntegrationTest;
import org.junit.Test;
import org.springframework.http.MediaType;

import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

public class NameControllerTest extends AbstractIntegrationTest {

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
