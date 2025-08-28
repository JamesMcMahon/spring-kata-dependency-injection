package sh.jfm.springbootdemos.dependencyinjection.kata5;

import org.springframework.stereotype.Component;

@Component
public class Mushrooms implements Topping {
    @Override
    public boolean isVegetarian() {
        return true;
    }
}
