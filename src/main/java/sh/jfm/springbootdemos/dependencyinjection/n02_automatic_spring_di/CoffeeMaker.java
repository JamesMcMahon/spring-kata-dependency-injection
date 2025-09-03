package sh.jfm.springbootdemos.dependencyinjection.n02_automatic_spring_di;

import org.springframework.stereotype.Component;

@Component
public class CoffeeMaker {
    private final Flavor flavor;

    public CoffeeMaker(Flavor flavor) {
        this.flavor = flavor;
    }

    public String brew() {
        return "Brewing coffee with %s.".formatted(flavor.name());
    }
}
