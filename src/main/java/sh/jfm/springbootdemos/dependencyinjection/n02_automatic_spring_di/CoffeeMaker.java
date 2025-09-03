package sh.jfm.springbootdemos.dependencyinjection.n02_automatic_spring_di;

import org.springframework.stereotype.Component;

@Component
public class CoffeeMaker {
    private final Flavor flavor;

    /// Taking the field in through the constructor is the preferred way to inject dependencies.
    public CoffeeMaker(Flavor flavor) {
        this.flavor = flavor;
    }

    public String brew() {
        return "Brewing coffee with %s.".formatted(flavor.name());
    }
}
