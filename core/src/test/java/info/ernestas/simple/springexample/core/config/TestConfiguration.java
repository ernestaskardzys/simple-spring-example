package info.ernestas.simple.springexample.core.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "info.ernestas.simple.springexample.core")
@Import(SimpleCoreConfiguration.class)
public class TestConfiguration {

}
