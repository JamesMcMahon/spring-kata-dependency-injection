package sh.jfm.springbootdemos.dependencyinjection.n12_optional_dependency;

import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CoffeeMaker {
    private final Optional<Sweetener> sweetener;

    public CoffeeMaker(Sweetener sweetener) {
        this.sweetener = Optional.ofNullable(sweetener);
    }

    public String brew() {
        return "Brewing coffee with %s.".formatted(
                sweetener.map(Sweetener::name).orElse("no sweetener")
        );
    }
}
