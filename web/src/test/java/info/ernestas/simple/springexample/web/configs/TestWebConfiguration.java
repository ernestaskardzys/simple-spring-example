package info.ernestas.simple.springexample.web.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(SimpleWebConfiguration.class)
public class TestWebConfiguration {

}
