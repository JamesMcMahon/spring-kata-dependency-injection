package sh.jfm.springbootdemos.dependencyinjection.n01_spring_di;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

/// Spring handles dependency injection for you.
/// As we saw in the last kata, for toy or smaller projects dependency injection can be done manually.
/// But for larger projects, manual dependency injection hits a lot of issues, and you often will end up writing
/// your own piecemeal dependency injection framework. Spring can handle this heavy lifting for you.
///
/// For the best understanding, a good place to start is to look at what Spring is doing in a less automatic and magical way.
/// The [ManualSpringConfig] is using annotations to make class instances as Spring beans. This gives Spring the ability
/// to manage said beans and inject them into other classes.
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = ManualSpringConfig.class)
class N01SpringDependencyInjectionTest {

    @Autowired
    private CoffeeMaker coffeeMaker;

    @Test
    void mochaCoffeeIsInjectedWithSpring() {
        assertEquals("Brewing coffee with Mocha.", coffeeMaker.brew());
    }
}