package sh.jfm.springbootdemos.dependencyinjection.n04_qualified_beans;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

/// In this kata there are more than one [Flavor] bean available, so we will have to be explicit about which one to use.
/// This can be done with manual configuration, but in this case lets solve it while still using automatic configuration.
/// Spring has the ability to select a specific bean using [org.springframework.beans.factory.annotation.Qualifier],
/// which can help it work through some ambiguous situations.
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = QualifiedBeansConfig.class)
class N04QualifiedBeansTest {

    @Autowired
    private StrawberryIceCreamMaker strawberryIceCreamMaker;

    @Autowired
    private VanillaIceCreamMaker vanillaIceCreamMaker;

    @Test
    void iceCreamFlavorsIsInjectedWithSpring() {
        assertEquals("Making ice cream with Strawberry.", strawberryIceCreamMaker.make());
        assertEquals("Making ice cream with Vanilla.", vanillaIceCreamMaker.make());
    }
}
