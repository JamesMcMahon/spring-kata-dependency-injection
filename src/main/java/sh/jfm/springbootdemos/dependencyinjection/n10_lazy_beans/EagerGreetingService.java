package sh.jfm.springbootdemos.dependencyinjection.n10_lazy_beans;

import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

/// Created eagerly at application-context start-up.
@Component
public class EagerGreetingService {

    private static final AtomicInteger COUNT = new AtomicInteger();

    public EagerGreetingService() {
        COUNT.incrementAndGet();
    }

    public String greet() {
        return "Hello, eager world!";
    }

    public static int instanceCount() {
        return COUNT.get();
    }
}
