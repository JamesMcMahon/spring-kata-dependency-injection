package sh.jfm.springbootdemos.dependencyinjection.n11_primary_beans;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

/// When more than one bean of the same type is available, Spring refuses to decide unless
/// one of them is annotated with [org.springframework.context.annotation.Primary].
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = n11Config.class)
class N11PrimaryBeansTest {

    @Autowired
    Sandwich sandwich;

    @Test
    void primaryCondimentIsInjectedByDefault() {
        assertEquals("Sandwich with Mustard", sandwich.describe());
    }
}
