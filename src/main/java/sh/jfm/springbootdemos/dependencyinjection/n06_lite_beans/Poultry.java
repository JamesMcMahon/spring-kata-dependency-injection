package sh.jfm.springbootdemos.dependencyinjection.n06_lite_beans;

public abstract class Poultry {
    protected final Poultry nested;

    public Poultry(Poultry nested) {
        this.nested = nested;
    }

    @Override
    public String toString() {
        if (nested == null) {
            return "%s with nothing inside 😕".formatted(name());
        }
        return "%s with a %s inside!".formatted(name(), nested.name());
    }

    public Poultry getNested() {
        return nested;
    }

    protected String name() {
        return getClass().getSimpleName();
    }
}
