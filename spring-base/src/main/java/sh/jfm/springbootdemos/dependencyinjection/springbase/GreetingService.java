package sh.jfm.springbootdemos.dependencyinjection.springbase;

public class GreetingService {
    public String greet(String name) {
        return "Hello %s!".formatted(name);
    }
}
