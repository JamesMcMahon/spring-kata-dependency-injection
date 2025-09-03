package sh.jfm.springbootdemos.dependencyinjection.n00_di_basics;

public class CoffeeMakerWithInjection implements CoffeeMaker {
    private final Flavor flavor;

    public CoffeeMakerWithInjection(Flavor flavor) {
        this.flavor = flavor;
    }

    public String brew() {
        return "Brewing coffee with %s.".formatted(flavor.name());
    }
}
