package sh.jfm.springbootdemos.dependencyinjection.n00_di_basics;

public class n00Start {

    public static CoffeeMaker buildCoffeeMaker() {
        return new CoffeeMakerNoInjection();
    }

    public static CoffeeMaker buildCoffeeMakerMocha() {
        return new CoffeeMakerWithInjection(new Mocha());
    }

    public static CoffeeMaker buildCoffeeMakerFrenchVanilla() {
        return new CoffeeMakerWithInjection(new Mocha());
    }


    public interface CoffeeMaker {
        String brew();
    }

    public static class CoffeeMakerNoInjection implements CoffeeMaker {
        private final Mocha mocha;

        public CoffeeMakerNoInjection() {
            this.mocha = new Mocha();
        }

        @Override
        public String brew() {
            return "Brewing coffee with %s.".formatted(mocha.name());
        }
    }

    public static class CoffeeMakerWithInjection implements CoffeeMaker {
        private final Flavor flavor;

        public CoffeeMakerWithInjection(Flavor flavor) {
            this.flavor = flavor;
        }

        public String brew() {
            return "Brewing coffee with %s.".formatted(flavor.name());
        }
    }

    public interface Flavor {
        String name();
    }

    public static class Mocha implements Flavor {
        @Override
        public String name() {
            return "Mocha";
        }
    }

    public static class FrenchVanilla implements Flavor {
        @Override
        public String name() {
            return "French Vanilla";
        }
    }
}
