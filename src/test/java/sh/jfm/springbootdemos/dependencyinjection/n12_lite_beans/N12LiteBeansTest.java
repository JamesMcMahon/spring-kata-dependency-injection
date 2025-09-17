package sh.jfm.springbootdemos.dependencyinjection.n12_lite_beans;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/// Spring's [Bean] have two distinct ways that can be processed by the framework. One is normal or what I am calling
/// "Full" mode, and the other mode is referred to by Spring as "Lite" mode.
///
/// Lite mode beans are processed differently. Rather than being full singletons, they can under some circumstances
/// be created multiple times. The full [Bean] Javadocs give a more in-depth explanation of Lite mode.
///
/// It's worth being aware of this mode as it can lead to some interesting scenarios when debugging.
@ExtendWith(SpringExtension.class)
public class N12LiteBeansTest {

    /// Full mode is what you are going to see in most projects
    @Nested
    @ContextConfiguration(classes = FullConfig.class)
    class FullTest {
        @Autowired
        private Turkey turkey;

        @Autowired
        private Duck duck;

        @Test
        void turkeyWithADuckInside() {
            assertEquals("Duck with nothing inside 😕", duck.toString());
            assertEquals("Turkey with a Duck inside!", turkey.toString());
            assertEquals(turkey.getNested(), duck);
        }
    }

    /// Lite mode is more unusual - the key difference is the config file is not proxied by Spring
    @Nested
    @ContextConfiguration(classes = LiteConfig.class)
    class LiteTest {
        @Autowired
        private Turkey turkey;

        @Autowired
        private Duck duck;

        @Test
        void duckWithATurkeyInside() {
            assertEquals("Turkey with nothing inside 😕", turkey.toString());
            assertEquals("Duck with a Turkey inside!", duck.toString());
            assertNotEquals(duck.getNested(), turkey);
        }
    }
}
