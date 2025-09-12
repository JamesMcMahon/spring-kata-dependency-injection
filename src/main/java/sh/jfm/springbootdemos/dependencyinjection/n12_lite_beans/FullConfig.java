package sh.jfm.springbootdemos.dependencyinjection.n12_lite_beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/// Standard Spring configuration - uses [Configuration] to manually configure all
/// necessary beans. This is what you will see in most projects that are doing any manual bean construction.
///
/// Distinct from Lite mode as each method is wrapped in a Proxy by Spring.
@Configuration
public class FullConfig {

    /// You can inject Duck as a parameter, but for the purposes of this Kata, I would avoid this approach as it
    /// avoids demonstrating the differences between the two modes.
    @Bean
    public Turkey turkey() {
        return new Turkey(null);
    }

    @Bean
    public Duck duck() {
        return new Duck(null);
    }
}
