package sh.jfm.springbootdemos.dependencyinjection.n05_profiles;

import org.springframework.stereotype.Component;

@Component
public class DevMessageService implements MessageService {
    @Override
    public String message() {
        return "Hello from dev";
    }
}
