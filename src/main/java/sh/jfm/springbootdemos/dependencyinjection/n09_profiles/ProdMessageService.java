package sh.jfm.springbootdemos.dependencyinjection.n09_profiles;

import org.springframework.stereotype.Component;

@Component
public class ProdMessageService implements MessageService {
    @Override
    public String message() {
        return "Hello from prod";
    }
}
