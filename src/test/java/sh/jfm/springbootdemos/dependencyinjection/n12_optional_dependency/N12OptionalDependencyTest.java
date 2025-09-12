package sh.jfm.springbootdemos.dependencyinjection.n12_optional_dependency;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

/// Spring can inject *optional* collaborators by accepting `java.util.Optional<BeanType>`
/// in a constructor (or setter). When a matching bean exists in the `ApplicationContext`,
/// the [Optional] is **present**; otherwise Spring supplies `Optional.empty()`.
///
/// This mechanism keeps consumers loosely-coupled: no `null` checks and no need for the
/// consumer to know the bean’s concrete type or define conditional annotations.
///
/// In this kata we spin up two independent contexts to illustrate both paths:
///
/// * **WithSweetenerConfig** – registers the `Sweetener` bean, so `CoffeeMaker`
///   brews sweet coffee.
/// * **WithoutSweetenerConfig** – filters the `Sweetener` bean from scanning.
///
/// Use optional injection when a collaborator is *nice-to-have* rather than mandatory.
///
/// *Remember, when done, both tests should pass at the same time.*
@ExtendWith(SpringExtension.class)
class N12OptionalDependencyTest {

    @Nested
    @ContextConfiguration(classes = WithSweetenerConfig.class)
    class WithSweetenerTest {
        @Autowired
        CoffeeMaker coffeeMaker;

        @Test
        void coffeeIsSweet() {
            assertEquals("Brewing coffee with Sugar.", coffeeMaker.brew());
        }
    }

    @Nested
    @ContextConfiguration(classes = WithoutSweetenerConfig.class)
    class NoSweetenerTest {
        @Autowired
        CoffeeMaker coffeeMaker;

        @Test
        void coffeeIsPlain() {
            assertEquals("Brewing coffee with no sweetener.", coffeeMaker.brew());
        }
    }
}
