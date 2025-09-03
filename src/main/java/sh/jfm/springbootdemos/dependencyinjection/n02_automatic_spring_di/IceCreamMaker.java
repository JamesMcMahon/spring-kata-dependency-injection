package sh.jfm.springbootdemos.dependencyinjection.n02_automatic_spring_di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IceCreamMaker {

    /// The use of [Autowired] here, called field injection, is not recommended. Using a constructor to take in the
    /// field gives you and any users of your code much more flexibility and is best practice.
    ///
    /// Still worth knowing about this approach as you will encounter this in the wild with existing Spring code.
    @Autowired
    private Flavor flavor;

    public String make() {
        return "Making ice cream with %s.".formatted(flavor.name());
    }
}