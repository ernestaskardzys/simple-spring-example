package info.ernestas.simple.springexample.web.rest;

import info.ernestas.simple.springexample.web.AbstractIntegrationTest;
import info.ernestas.simple.springexample.web.model.rest.ResponseStatus;
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
            .andExpect(jsonPath("$.status", is(ResponseStatus.SUCCESS.toString())))
            .andExpect(jsonPath("$.results[0].sumResult", is(14.9)))
            .andExpect(jsonPath("$.results[0].subtractionResult", is(6.1)))
            .andExpect(jsonPath("$.results[0].multiplicationResult", is(46.2)))
            .andExpect(jsonPath("$.results[0].divisionResult", is(2.3863636363636362)));
    }

}