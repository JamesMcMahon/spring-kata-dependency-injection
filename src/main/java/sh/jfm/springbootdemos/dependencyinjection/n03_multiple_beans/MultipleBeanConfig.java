package sh.jfm.springbootdemos.dependencyinjection.n03_multiple_beans;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "sh.jfm.springbootdemos.dependencyinjection.n03_multiple_beans")
public class MultipleBeanConfig {
}
