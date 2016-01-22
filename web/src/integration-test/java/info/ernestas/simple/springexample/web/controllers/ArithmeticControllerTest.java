package info.ernestas.simple.springexample.web.controllers;

import info.ernestas.simple.springexample.web.configs.TestWebConfiguration;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = TestWebConfiguration.class)
public class ArithmeticControllerTest {

    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void testfa() throws Exception {
        mockMvc.perform(get("/arithmetic/all")
            .param("first", "10.5")
            .param("second", "4.4")
            .accept(MediaType.TEXT_HTML))
            .andExpect(status().isOk())
            .andExpect(view().name("arithmetic"))
            .andExpect(forwardedUrl("/WEB-INF/pages/arithmetic.jsp"))
            .andExpect(model().attribute("sum", is(14.9)))
            .andExpect(model().attribute("subtract", is(6.1)))
            .andExpect(model().attribute("multiply", is(46.2)))
            .andExpect(model().attribute("divide", is(2.3863636363636362)))
        ;
    }
}
