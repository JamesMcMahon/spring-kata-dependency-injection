package sh.jfm.springbootdemos.dependencyinjection.kata2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@Component
public class IceCreamMaker {

    @Autowired
    private Flavor flavor;

    public String make() {
        return "Making ice cream with %s.".formatted(flavor.name());
    }
}