package sh.jfm.springbootdemos.dependencyinjection.n02_automatic_spring_di;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/// No direct bean registration needed with the component scan. Everything marked with [org.springframework.stereotype.Component]
/// will be picked up and registered by Spring.
@Configuration
@ComponentScan(basePackages = "sh.jfm.springbootdemos.dependencyinjection.n02_automatic_spring_di")
public class AutomaticSpringConfig {

}
