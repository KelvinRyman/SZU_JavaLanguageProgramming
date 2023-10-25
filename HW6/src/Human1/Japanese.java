package Human1;

public class Japanese implements Human {
    String name;

    public Japanese(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {
        System.out.println("こんにちは、私の名前は" + name);
    }
}
