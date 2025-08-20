package sh.jfm.springbootdemos.dependencyinjection.kata3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Kata3Config {

    @SuppressWarnings("unused")
    public Flavor flavor() {
        return new Mocha();
    }

    @Bean
    public CoffeeMaker coffeeMaker(Flavor flavor) {
        return new CoffeeMaker(flavor);
    }
}
