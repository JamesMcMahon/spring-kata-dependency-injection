package sh.jfm.springbootdemos.dependencyinjection.n01_spring_di;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = Kata2Config.class)
class Kata2Test {

    @Autowired
    private CoffeeMaker coffeeMaker;

    @Autowired
    private IceCreamMaker iceCreamMaker;

    @Test
    void mochaCoffeeIsInjectedWithSpring() {
        assertEquals("Brewing coffee with Mocha.", coffeeMaker.brew());
    }

    @Test
    void mochaIceCreamIsInjectedWithSpring() {
        assertEquals("Making ice cream with Mocha.", iceCreamMaker.make());
    }
}