package sh.jfm.springbootdemos.dependencyinjection.n01_spring_di;

public class CoffeeMaker {
    private final Flavor flavor;

    public CoffeeMaker(Flavor flavor) {
        this.flavor = flavor;
    }

    public String brew() {
        return "Brewing coffee with %s.".formatted(flavor.name());
    }
}
