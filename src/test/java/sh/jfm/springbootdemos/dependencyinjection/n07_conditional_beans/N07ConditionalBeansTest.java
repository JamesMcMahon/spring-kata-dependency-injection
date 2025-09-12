package sh.jfm.springbootdemos.dependencyinjection.n07_conditional_beans;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/// Run time configuration can affect dependency injection.
/// Spring supports conditional beans through the [org.springframework.context.annotation.Conditional] annotation.
///
/// I've added Spring Boot as a dependency for this scenario because it adds a lot of out-of-the-box conditions, so you
/// wouldn't need to write them yourself.
///
/// There are a few different ways to get this to pass. I'll challenge you to use two different conditions on the
/// [Topping] classes to make the tests pass.
///
/// Remember that **both** tests should pass at the same time.
@ExtendWith(SpringExtension.class)
public class N07ConditionalBeansTest {

    @Nested
    @TestPropertySource(properties = "vegetarian=true")
    @ContextConfiguration(classes = ConditionalBeansConfig.class)
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
    @ContextConfiguration(classes = ConditionalBeansConfig.class)
    class PepperoniTest {

        @Autowired
        private Pizza pizzaPie;

        @Test
        void pizzaIsNotVegetarian() {
            assertFalse(pizzaPie.isVegetarian());
        }
    }
}
