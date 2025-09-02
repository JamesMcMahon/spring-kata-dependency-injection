package sh.jfm.springbootdemos.dependencyinjection.n03_multiple_beans;

import org.springframework.stereotype.Component;

@Component
public class IceCreamMaker {

    private final Flavor flavor;

    public IceCreamMaker(Flavor flavor) {
        this.flavor = flavor;
    }

    public String make() {
        return "Making ice cream with %s.".formatted(flavor.name());
    }
}