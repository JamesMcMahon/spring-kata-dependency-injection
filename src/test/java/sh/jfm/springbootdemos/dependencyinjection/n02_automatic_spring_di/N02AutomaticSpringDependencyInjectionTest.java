package sh.jfm.springbootdemos.dependencyinjection.n02_automatic_spring_di;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

/// Spring Dependency Injection can also be done automatically with the [ComponentScan] annotation.
/// This scan will find all components in a given package and avoids the need for manually registering beans.
/// This is done automatically in a Spring Boot application.
///
/// To make the test pass, ensure that the [Chocolate] class is marked as a component so it can be picked up by Spring.
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = AutomaticSpringConfig.class)
class N02AutomaticSpringDependencyInjectionTest {

    @Autowired
    private CoffeeMaker coffeeMaker;

    @Autowired
    private IceCreamMaker iceCreamMaker;

    @Test
    void chocolateCoffeeAndIceCreamIsInjectedWithSpring() {
        assertEquals("Brewing coffee with Chocolate.", coffeeMaker.brew());
        assertEquals("Making ice cream with Chocolate.", iceCreamMaker.make());
    }
}