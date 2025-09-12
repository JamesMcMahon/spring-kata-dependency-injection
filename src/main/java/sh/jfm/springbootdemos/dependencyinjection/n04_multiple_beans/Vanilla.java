package sh.jfm.springbootdemos.dependencyinjection.n04_multiple_beans;

import org.springframework.stereotype.Component;

@Component
public class Vanilla implements Flavor {
    @Override
    public String name() {
        return "Vanilla";
    }
}
