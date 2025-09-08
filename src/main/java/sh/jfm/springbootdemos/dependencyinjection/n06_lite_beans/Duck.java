package sh.jfm.springbootdemos.dependencyinjection.n06_lite_beans;

public class Duck extends Poultry {
    public Duck(Poultry poultry) {
        super(poultry);
        System.out.printf("Duck created with hashcode [%d]%n", hashCode());
    }
}
