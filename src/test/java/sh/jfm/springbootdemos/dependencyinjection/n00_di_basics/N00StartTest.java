package sh.jfm.springbootdemos.dependencyinjection.n00_di_basics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static sh.jfm.springbootdemos.dependencyinjection.n00_di_basics.n00Start.*;

/// Intro to [dependency injection](https://en.wikipedia.org/wiki/Dependency_injection)
///
/// The core concept of dependency injection is straightforward, but it pays dividends in larger projects.
/// Even in this very simple example, you can see how it allows you to the flexibility to reuse code.
///
/// I recommend also reading about [Dependency inversion principle](https://en.wikipedia.org/wiki/Dependency_inversion_principle)
///
/// This test will fail initially. Update just the implementation code (ie, code being tested in the `main` directory),
/// to make the test pass.
class N00StartTest {

    @Test
    void testDependencyInjectionCreatesFlexibility() {
        assertEquals("Brewing coffee with Mocha.", buildCoffeeMaker().brew());
        // good luck if you want French Vanilla!

        assertEquals("Brewing coffee with Mocha.", buildCoffeeMakerMocha().brew());
        assertEquals("Brewing coffee with French Vanilla.", buildCoffeeMakerFrenchVanilla().brew());
    }
}