package sh.jfm.springbootdemos.dependencyinjection.n07_conditional_beans;

import org.springframework.stereotype.Component;

@Component
public class Pepperoni implements Topping {
    @Override
    public boolean isVegetarian() {
        return false;
    }
}
