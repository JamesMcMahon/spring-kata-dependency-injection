package sh.jfm.springbootdemos.dependencyinjection.n08_bean_scopes;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/// Bean that can pour fresh cups on demand. There should only be one of these.
/// Demonstrates injecting a bean using [ObjectProvider].
@Component
@Scope("prototype")
public class CoffeeShop {

    private final ObjectProvider<Cup> cupProvider;

    public CoffeeShop(ObjectProvider<Cup> cupProvider) {
        this.cupProvider = cupProvider;
    }

    public Cup pourCup() {
        return cupProvider.getObject();
    }
}
