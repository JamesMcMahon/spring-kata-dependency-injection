package sh.jfm.springbootdemos.dependencyinjection.n11_custom_qualifier;

import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.stream.Collectors;

/// Mixes a smoothie from every [Flavor] bean carrying the [Berry] qualifier.
///
/// Demonstrates constructor injection of a **collection** filtered by a custom qualifier.
@Component
public class Blender {

    private final Collection<Flavor> berryFlavours;

    public Blender(@Berry Collection<Flavor> berryFlavours) {
        this.berryFlavours = berryFlavours;
    }

    public String blend() {
        return "Blending smoothie with %s.".formatted(
                berryFlavours.stream()
                        .map(Flavor::name)
                        .sorted()
                        .collect(Collectors.joining(", "))
        );
    }
}
