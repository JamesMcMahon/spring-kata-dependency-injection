package sh.jfm.springbootdemos.dependencyinjection.n03_primary_beans;

import org.springframework.stereotype.Component;

@Component
public class Mustard implements Condiment {
    @Override
    public String name() {
        return "Mustard";
    }
}
