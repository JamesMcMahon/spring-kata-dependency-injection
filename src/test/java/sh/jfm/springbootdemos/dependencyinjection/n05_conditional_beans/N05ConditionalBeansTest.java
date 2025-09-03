package sh.jfm.springbootdemos.dependencyinjection.n05_conditional_beans;

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
public class N05ConditionalBeansTest {

    @Nested
    @TestPropertySource(properties = "vegetarian=true")
    @ContextConfiguration(classes = n05Config.class)
    class MushroomTest {

        @Autowired
        private Pizza pizzaPie;

        @Test
        void pizzaIsVegetarian() {
            assertTrue(pizzaPie.isVegetarian());
        }
    }

    @Nested
    @TestPropertySource(properties = "vegetarian=false")
    @ContextConfiguration(classes = n05Config.class)
    class PepperoniTest {

        @Autowired
        private Pizza pizzaPie;

        @Test
        void pizzaIsNotVegetarian() {
            assertFalse(pizzaPie.isVegetarian());
        }
    }
}
