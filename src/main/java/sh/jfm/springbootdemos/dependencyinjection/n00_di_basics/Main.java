package sh.jfm.springbootdemos.dependencyinjection.n00_di_basics;

public class Main {
    public static CoffeeMaker buildCoffeeMaker() {
        return new CoffeeMakerNoInjection();
    }

    public static CoffeeMaker buildCoffeeMakerMocha() {
        return new CoffeeMakerWithInjection(new Mocha());
    }

    public static CoffeeMaker buildCoffeeMakerFrenchVanilla() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
