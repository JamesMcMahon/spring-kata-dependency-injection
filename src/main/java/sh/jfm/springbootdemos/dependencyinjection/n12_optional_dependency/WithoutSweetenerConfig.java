package sh.jfm.springbootdemos.dependencyinjection.n12_optional_dependency;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
// scan but excludes Sweetener bean so CoffeeMaker is created without a Sweetener,
// also need to exclude the other config class
@ComponentScan(
        basePackages = "sh.jfm.springbootdemos.dependencyinjection.n12_optional_dependency",
        excludeFilters = @ComponentScan.Filter(
                type = FilterType.ASSIGNABLE_TYPE,
                classes = {Sweetener.class, WithSweetenerConfig.class}
        )
)
public class WithoutSweetenerConfig {
}
