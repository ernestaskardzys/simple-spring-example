package info.ernestas.simple.springexample.web.configs;

import info.ernestas.simple.springexample.core.config.SimpleCoreConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {SimpleCoreConfiguration.class})
@ComponentScan(basePackages = "info.ernestas.simple.springexample.web")
public class SimpleWebConfiguration {

}
