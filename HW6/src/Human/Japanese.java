package Human;

public class Japanese extends Human {
    public Japanese(String name) {
        super(name);
    }

    public void sayHello() {
        System.out.println("こんにちは、私は" + name);
    }
}
