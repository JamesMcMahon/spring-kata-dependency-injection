package sh.jfm.springbootdemos.dependencyinjection.n11_custom_qualifier;

import org.springframework.stereotype.Component;

@Berry
@Component
public class Banana implements Flavor {
    @Override
    public String name() {
        return "Banana";
    }
}
