package sh.jfm.springbootdemos.dependencyinjection.n03_multiple_beans;

import org.springframework.stereotype.Component;

@Component
public class Vanilla implements Flavor {
    @Override
    public String name() {
        return "Vanilla";
    }
}
