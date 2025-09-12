package sh.jfm.springbootdemos.dependencyinjection.n12_lite_beans;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/// The use of [Component] instead of [org.springframework.context.annotation.Configuration] causes this config to
/// be process beans in Lite mode. In Lite mode, [Bean] methods are treated as plain old Java factory methods.
///
/// I expect that the [Turkey] instance inside the [Duck] will be distinct from the Turkey bean.
///
/// **Hint: The methods in this config will behave like a standard Java factory method**
@Component
public class LiteConfig {
    @Bean
    public Turkey turkey() {
        return new Turkey(null);
    }

    /// You can inject Turkey as a parameter, but for the purposes of this Kata, I would avoid this approach as it
    /// avoids demonstrating the differences between the two modes.
    @Bean
    public Duck duck() {
        return new Duck(null);
    }
}
