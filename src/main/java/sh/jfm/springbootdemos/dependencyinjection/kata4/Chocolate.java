package sh.jfm.springbootdemos.dependencyinjection.kata4;

import org.springframework.stereotype.Component;

@Component
public class Chocolate implements Flavor {
    @Override
    public String name() {
        return "Chocolate";
    }
}
