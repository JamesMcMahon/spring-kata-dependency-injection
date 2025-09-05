package sh.jfm.springbootdemos.dependencyinjection.n06_lite_beans;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class LiteModeConfig {
    @Bean
    public Turkey turkey() {
        return new Turkey(null);
    }

    @Bean
    public Duck duck(Turkey turkey) {
        return new Duck(turkey);
    }
}
