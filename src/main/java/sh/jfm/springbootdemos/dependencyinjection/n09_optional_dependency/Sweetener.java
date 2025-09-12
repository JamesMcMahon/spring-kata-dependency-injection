package sh.jfm.springbootdemos.dependencyinjection.n09_optional_dependency;

import org.springframework.stereotype.Component;

@Component
public class Sweetener {
    public String name() {
        return "Monk Fruit";
    }
}
