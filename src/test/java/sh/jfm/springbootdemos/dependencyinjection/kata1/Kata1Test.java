package sh.jfm.springbootdemos.dependencyinjection.kata1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static sh.jfm.springbootdemos.dependencyinjection.kata1.Kata1.*;

class Kata1Test {

    @Test
    void testDependencyInjectionCreatesFlexibility() {
        assertEquals("Brewing coffee with Mocha.", buildCoffeeMaker().brew());
        // good luck if you want French Vanilla!

        assertEquals("Brewing coffee with Mocha.", buildCoffeeMakerMocha().brew());
        assertEquals("Brewing coffee with French Vanilla.", buildCoffeeMakerFrenchVanilla().brew());
    }
}