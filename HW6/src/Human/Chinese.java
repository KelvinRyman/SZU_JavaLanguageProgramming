package Human;

public class Chinese extends Human {
    public Chinese(String name) {
        super(name);
    }

    public void sayHello() {
        System.out.println("你好，我是" + name);
    }
}
