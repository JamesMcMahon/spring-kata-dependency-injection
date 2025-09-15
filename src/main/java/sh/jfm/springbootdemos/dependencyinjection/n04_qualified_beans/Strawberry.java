package sh.jfm.springbootdemos.dependencyinjection.n04_qualified_beans;

import org.springframework.stereotype.Component;

@Component
public class Strawberry implements Flavor {
    @Override
    public String name() {
        return "Strawberry";
    }
}
