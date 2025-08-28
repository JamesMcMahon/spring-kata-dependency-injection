package sh.jfm.springbootdemos.dependencyinjection.kata5;

import org.springframework.stereotype.Component;

@Component
public class Pizza {

    private final Topping topping;

    public Pizza(Topping topping) {
        this.topping = topping;
    }

    public boolean isVegetarian() {
        return topping.isVegetarian();
    }
}
