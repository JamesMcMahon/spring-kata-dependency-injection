package sh.jfm.springbootdemos.dependencyinjection.n03_primary_beans;

import org.springframework.stereotype.Component;

/// Consumes a [Condiment]. Spring injects the `@Primary`
/// implementation unless a qualifier expresses otherwise.
@Component
public class Sandwich {
    private final Condiment condiment;

    public Sandwich(Condiment condiment) {
        this.condiment = condiment;
    }

    public String describe() {
        return "Sandwich with %s".formatted(condiment.name());
    }
}
