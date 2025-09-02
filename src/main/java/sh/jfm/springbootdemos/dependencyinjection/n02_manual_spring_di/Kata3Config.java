package sh.jfm.springbootdemos.dependencyinjection.n02_manual_spring_di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Kata3Config {

    public Flavor flavor() {
        return new Mocha();
    }

    @Bean
    public CoffeeMaker coffeeMaker(Flavor flavor) {
        return new CoffeeMaker(flavor);
    }
}
