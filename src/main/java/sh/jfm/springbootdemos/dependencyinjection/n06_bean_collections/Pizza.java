package sh.jfm.springbootdemos.dependencyinjection.n06_bean_collections;

import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class Pizza {

    private final Collection<Topping> toppings;

    public Pizza(Collection<Topping> toppings) {
        this.toppings = toppings;
    }

    public String toppings() {
        return "Toppings: %s".formatted(describeToppings());
    }

    private String describeToppings() {
        return toppings.stream()
                .map(Topping::name)
                .reduce((a, b) -> a + ", " + b)
                .orElse("No toppings");
    }
}
