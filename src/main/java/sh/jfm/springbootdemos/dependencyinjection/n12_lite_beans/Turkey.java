package sh.jfm.springbootdemos.dependencyinjection.n12_lite_beans;

public class Turkey extends Poultry {
    public Turkey(Poultry poultry) {
        super(poultry);
        System.out.printf("Turkey created with hashcode [%d]%n", hashCode());
    }
}
