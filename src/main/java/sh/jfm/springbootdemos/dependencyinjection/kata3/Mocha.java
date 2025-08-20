package sh.jfm.springbootdemos.dependencyinjection.kata3;

@SuppressWarnings("unused")
public class Mocha implements Flavor {
    @Override
    public String name() {
        return "Mocha";
    }
}
