package sh.jfm.springbootdemos.dependencyinjection.n11_primary_beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Mustard implements Condiment {
    @Override
    public String name() {
        return "Mustard";
    }
}
