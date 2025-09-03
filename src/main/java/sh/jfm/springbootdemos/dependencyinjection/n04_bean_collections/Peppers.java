package sh.jfm.springbootdemos.dependencyinjection.n04_bean_collections;

import org.springframework.stereotype.Component;

@Component
public class Peppers implements Topping {
    @Override
    public String name() {
        return "peppers";
    }
}
