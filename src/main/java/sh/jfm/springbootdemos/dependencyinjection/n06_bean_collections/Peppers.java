package sh.jfm.springbootdemos.dependencyinjection.n06_bean_collections;

import org.springframework.stereotype.Component;

@Component
public class Peppers implements Topping {
    @Override
    public String name() {
        return "peppers";
    }
}
