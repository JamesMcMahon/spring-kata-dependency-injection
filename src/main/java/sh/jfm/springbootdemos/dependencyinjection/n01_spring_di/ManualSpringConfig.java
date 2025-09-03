package sh.jfm.springbootdemos.dependencyinjection.n01_spring_di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/// Spring can handle construction of beans / class instances for you, but it is also possible to manually initialize
/// instances and let Spring manage them for you. This can give you more explicit control over beans, and in some cases
/// is needed when Spring needs help resolving ambiguous situations.
///
/// For this Kata, starting with the more explicit workflow allows us to better understand what Spring
/// is doing automatically for future Katas.
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
