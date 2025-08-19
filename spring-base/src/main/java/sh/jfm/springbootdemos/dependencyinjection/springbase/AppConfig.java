package sh.jfm.springbootdemos.dependencyinjection.springbase;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "sh.jfm.springbootdemos.dependencyinjection.springbase")
public class AppConfig {
}
