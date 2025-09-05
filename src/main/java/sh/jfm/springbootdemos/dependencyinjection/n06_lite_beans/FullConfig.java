package sh.jfm.springbootdemos.dependencyinjection.n06_lite_beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FullConfig {
    @Bean
    public Turkey turkey() {
        return new Turkey(duck());
    }

    @Bean
    public Duck duck() {
        return new Duck(null);
    }
}
