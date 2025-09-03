package sh.jfm.springbootdemos.dependencyinjection.n00_di_basics;

public class CoffeeMakerNoInjection implements CoffeeMaker {
    private final Mocha mocha;

    public CoffeeMakerNoInjection() {
        this.mocha = new Mocha();
    }

    @Override
    public String brew() {
        return "Brewing coffee with %s.".formatted(mocha.name());
    }
}
