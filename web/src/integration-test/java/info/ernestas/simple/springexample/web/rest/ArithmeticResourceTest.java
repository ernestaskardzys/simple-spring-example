package info.ernestas.simple.springexample.web.rest;

import info.ernestas.simple.springexample.web.AbstractIntegrationTest;
import org.junit.Test;
import org.springframework.http.MediaType;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class ArithmeticResourceTest extends AbstractIntegrationTest {

    @Test
    public void testCalculateAllResultsRest() throws Exception {
        mockMvc.perform(get("/rest/arithmetic/all")
            .param("first", "10.5")
            .param("second", "4.4")
            .accept(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.sumResult", is(14.9)))
            .andExpect(jsonPath("$.subtractionResult", is(6.1)))
            .andExpect(jsonPath("$.multiplicationResult", is(46.2)))
            .andExpect(jsonPath("$.divisionResult", is(2.3863636363636362)));
    }

}