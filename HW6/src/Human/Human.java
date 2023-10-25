package Human;

public abstract class Human {
    String name;

    protected Human(String name) {
        this.name = name;
    }

    public abstract void sayHello();
}
