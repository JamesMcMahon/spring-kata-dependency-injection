package sh.jfm.springbootdemos.dependencyinjection.n11_custom_qualifier;

import org.springframework.stereotype.Component;

@Component
public class Blueberry implements Flavor {
    @Override
    public String name() {
        return "Blueberry";
    }
}
