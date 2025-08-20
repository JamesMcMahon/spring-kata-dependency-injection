package sh.jfm.springbootdemos.dependencyinjection.kata2;

import org.springframework.stereotype.Component;

@Component
public class CoffeeMaker {
    private final Flavor flavor;

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    public CoffeeMaker(Flavor flavor) {
        this.flavor = flavor;
    }

    public String brew() {
        return "Brewing coffee with %s.".formatted(flavor.name());
    }
}
