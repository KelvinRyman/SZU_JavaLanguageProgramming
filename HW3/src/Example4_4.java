public class Example4_4 {   // Box test
    public static void main(String[] args) {
        Box box = new Box();    // 创建 Box 类的对象 box
        box.setInfo(10, 20, 30);    // 设置 box 的尺寸为长 10、宽 20、高 30
        System.out.println(box.toString()); // 打印 box 的描述信息：尺寸、体积、表面积
    }
}
