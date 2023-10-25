package Human1;

public class English implements Human {
    String name;

    public English(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {
        System.out.println("Hello, my name is " + name);
    }
}
