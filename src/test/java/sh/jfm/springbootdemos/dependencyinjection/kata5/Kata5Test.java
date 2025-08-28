package sh.jfm.springbootdemos.dependencyinjection.kata5;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = Kata5Config.class)
public class Kata5Test {

    @Autowired
    private Pizza pizzaPie;

    @Nested
    @TestPropertySource(properties = "vegetarian=false")
    class PepperoniTest {

        @Test
        void pizzaIsNotVegetarian() {
            assertFalse(pizzaPie.isVegetarian());
        }
    }

    @Nested
    @TestPropertySource(properties = "vegetarian=true")
    class MushroomTest {

        @Test
        void pizzaIsVegetarian() {
            assertTrue(pizzaPie.isVegetarian());
        }
    }
}
