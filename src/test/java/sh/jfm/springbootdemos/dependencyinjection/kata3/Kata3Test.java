package sh.jfm.springbootdemos.dependencyinjection.kata3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = Kata3Config.class)
class Kata3Test {

    @Autowired
    private CoffeeMaker coffeeMaker;

    @Test
    void mochaCoffeeIsInjectedWithSpring() {
        assertEquals("Brewing coffee with Mocha.", coffeeMaker.brew());
    }
}