package Human;

public class English extends Human {
    public English(String name) {
        super(name);
    }

    public void sayHello() {
        System.out.println("Hello, I'm " + name);
    }
}
