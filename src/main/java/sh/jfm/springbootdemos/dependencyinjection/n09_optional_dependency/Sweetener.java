package sh.jfm.springbootdemos.dependencyinjection.n09_optional_dependency;

import org.springframework.stereotype.Component;

@Component
public class Sweetener {
    public String name() {
        throw new UnsupportedOperationException("You will need to name this sweetener in order for the test to pass");
    }
}
