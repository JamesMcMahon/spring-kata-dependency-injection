package sh.jfm.springbootdemos.dependencyinjection.n04_multiple_beans;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

/// Spring does a lot for you automatically, but in ambiguous situations the user will need to specify behavior more
/// explicitly.
///
/// In this case there are more than one [Flavor] bean available, so we will have to be explicit about which one to use.
/// This can be done with manual configuration but can also be solved under automatic configuration.
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = MultipleBeanConfig.class)
class N04MultipleBeansTest {

    @Autowired
    private IceCreamMaker iceCreamMaker;

    @Test
    void strawberryIceCreamIsInjectedWithSpring() {
        assertEquals("Making ice cream with Strawberry.", iceCreamMaker.make());
    }
}
