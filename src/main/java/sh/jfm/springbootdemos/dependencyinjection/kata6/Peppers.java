package sh.jfm.springbootdemos.dependencyinjection.kata6;

import org.springframework.stereotype.Component;

@Component
public class Peppers implements Topping {
    @Override
    public String name() {
        return "peppers";
    }
}
