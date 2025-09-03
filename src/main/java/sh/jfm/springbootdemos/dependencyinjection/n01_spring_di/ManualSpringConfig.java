package sh.jfm.springbootdemos.dependencyinjection.n01_spring_di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ManualSpringConfig {

    public Flavor flavor() {
        return new Mocha();
    }

    @Bean
    public CoffeeMaker coffeeMaker(Flavor flavor) {
        return new CoffeeMaker(flavor);
    }
}
