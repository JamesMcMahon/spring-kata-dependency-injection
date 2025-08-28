package sh.jfm.springbootdemos.dependencyinjection.kata5;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBooleanProperty;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@ConditionalOnBooleanProperty(name = "vegetarian")
@Component
public class Mushrooms implements Topping {
    @Override
    public boolean isVegetarian() {
        return true;
    }
}
