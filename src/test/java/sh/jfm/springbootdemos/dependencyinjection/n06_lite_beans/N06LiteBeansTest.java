package sh.jfm.springbootdemos.dependencyinjection.n06_lite_beans;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@ExtendWith(SpringExtension.class)
public class N06LiteBeansTest {
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

    @Nested
    @ContextConfiguration(classes = LiteModeConfig.class)
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
