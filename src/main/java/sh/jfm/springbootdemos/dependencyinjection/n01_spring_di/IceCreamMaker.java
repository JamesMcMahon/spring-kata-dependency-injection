package sh.jfm.springbootdemos.dependencyinjection.n01_spring_di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IceCreamMaker {

    @Autowired
    private Flavor flavor;

    public String make() {
        return "Making ice cream with %s.".formatted(flavor.name());
    }
}