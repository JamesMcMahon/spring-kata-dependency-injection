package sh.jfm.springbootdemos.dependencyinjection.n08_lazy_beans;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

/// Spring has the concept of [lazy initialization](https://docs.spring.io/spring-framework/reference/core/beans/dependencies/factory-lazy-init.html).
///
/// Spring eagerly instantiates singleton beans when the application context starts.
/// Marking a bean as lazy defers its construction until it is first requested
/// from the context, which can shorten start-up time or help break circular
/// dependencies.
///
/// The test asserts that the eager bean exists immediately, while the lazy bean
/// is instantiated only after it is explicitly fetched from the
/// [org.springframework.context.ApplicationContext].
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = n08Config.class)
class N08LazyBeansTest {

    @Autowired
    ApplicationContext context;

    @Test
    void lazyBeanIsCreatedLazily() {
        // eager bean constructed during context start-up
        assertEquals(1, EagerGreetingService.instanceCount());

        // lazy bean not yet constructed
        assertEquals(0, LazyGreetingService.instanceCount());

        // first access triggers construction
        assertEquals("Hello, lazy world!", context.getBean(LazyGreetingService.class).greet());
        assertEquals(1, LazyGreetingService.instanceCount());
    }
}
