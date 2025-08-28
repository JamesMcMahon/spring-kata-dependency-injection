package sh.jfm.springbootdemos.dependencyinjection.kata5;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.stereotype.Component;

@ConditionalOnMissingBean(value = Topping.class)
@Component
public class Pepperoni implements Topping{
    @Override
    public boolean isVegetarian() {
        return false;
    }
}
