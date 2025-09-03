package sh.jfm.springbootdemos.dependencyinjection.n02_automatic_spring_di;

public class Mocha implements Flavor {
    @Override
    public String name() {
        return "Mocha";
    }
}
