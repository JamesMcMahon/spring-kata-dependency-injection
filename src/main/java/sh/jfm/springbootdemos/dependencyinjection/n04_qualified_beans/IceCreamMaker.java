package sh.jfm.springbootdemos.dependencyinjection.n04_qualified_beans;

import org.springframework.stereotype.Component;

@Component
public class IceCreamMaker {

    private final Flavor flavor;

    /// We need a flavor, but which one? We could specify a concrete flavor here, but then we tie our implementation
    /// to that specific flavor, making change more difficult down the line.
    public IceCreamMaker(Flavor flavor) {
        this.flavor = flavor;
    }

    public String make() {
        return "Making ice cream with %s.".formatted(flavor.name());
    }
}
