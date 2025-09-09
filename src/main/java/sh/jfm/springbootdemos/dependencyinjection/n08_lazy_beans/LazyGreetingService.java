package sh.jfm.springbootdemos.dependencyinjection.n08_lazy_beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

/// Only instantiated when first requested from the Spring context.
@Component
public class LazyGreetingService {

    private static final AtomicInteger COUNT = new AtomicInteger();

    public LazyGreetingService() {
        COUNT.incrementAndGet();
    }

    public String greet() {
        return "Hello, lazy world!";
    }

    public static int instanceCount() {
        return COUNT.get();
    }
}
