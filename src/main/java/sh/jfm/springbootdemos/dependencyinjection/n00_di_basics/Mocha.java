package sh.jfm.springbootdemos.dependencyinjection.n00_di_basics;

public class Mocha implements Flavor {
    @Override
    public String name() {
        return "Mocha";
    }
}
