package sh.jfm.springbootdemos.dependencyinjection.n02_automatic_spring_di;

public class Chocolate implements Flavor {
    @Override
    public String name() {
        return "Chocolate";
    }
}
