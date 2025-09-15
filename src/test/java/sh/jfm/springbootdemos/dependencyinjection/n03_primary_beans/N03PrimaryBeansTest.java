package sh.jfm.springbootdemos.dependencyinjection.n03_primary_beans;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

/// Spring does a lot for you automatically, but in ambiguous situations the user will need to specify behavior
/// explicitly.
///
/// For instance, when more than one bean of the same type is available, Spring does not know which one to use
/// unless one of them is annotated with [org.springframework.context.annotation.Primary].
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = PrimaryBeansConfig.class)
class N03PrimaryBeansTest {

    @Autowired
    Sandwich sandwich;

    @Test
    void primaryCondimentIsInjectedByDefault() {
        assertEquals("Sandwich with Mustard", sandwich.describe());
    }
}
