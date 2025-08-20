package sh.jfm.springbootdemos.dependencyinjection.kata2;

@SuppressWarnings("unused")
public class Mocha implements Flavor {
    @Override
    public String name() {
        return "Mocha";
    }
}
