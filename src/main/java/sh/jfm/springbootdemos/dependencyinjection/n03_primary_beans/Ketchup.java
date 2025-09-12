package sh.jfm.springbootdemos.dependencyinjection.n03_primary_beans;

import org.springframework.stereotype.Component;

@Component
public class Ketchup implements Condiment {
    @Override
    public String name() {
        return "Ketchup";
    }
}
