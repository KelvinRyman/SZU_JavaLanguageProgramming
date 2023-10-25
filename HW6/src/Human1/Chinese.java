package Human1;

public class Chinese implements Human {
    String name;

    public Chinese(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {
        System.out.println("你好，我的名字是" + name);
    }
}
