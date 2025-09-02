package sh.jfm.springbootdemos.dependencyinjection.n03_multiple_beans;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = n03Config.class)
class N03MultipleBeansTest {

    @Autowired
    private IceCreamMaker iceCreamMaker;

    @Test
    void strawberryIceCreamIsInjectedWithSpring() {
        assertEquals("Making ice cream with Strawberry.", iceCreamMaker.make());
    }
}