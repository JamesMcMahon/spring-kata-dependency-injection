package sh.jfm.springbootdemos.dependencyinjection.n12_optional_dependency;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
// scan but exclude other config class
@ComponentScan(
        basePackages = "sh.jfm.springbootdemos.dependencyinjection.n12_optional_dependency",
        excludeFilters = @ComponentScan.Filter(
                type = FilterType.ASSIGNABLE_TYPE,
                classes = {WithoutSweetenerConfig.class}
        )
)
public class WithSweetenerConfig {
}
