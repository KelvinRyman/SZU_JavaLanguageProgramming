public class Example4_5 {   // Cylindrical test

    public static void main(String[] args) {
        Cylindrical cyl = new Cylindrical();   // 利用无参的构造方法创建 Cylindrical 类的对象 cyl
        Cylindrical cyl1 = new Cylindrical(50, 60);
        // 利用有参的构造方法创建 Cylindrical 类的对象 cyl1，指定高度为 50，半径为 60
        cyl.setInfo(10, 20); // 设置 cyl 的高度为 10，半径为 20
        System.out.println(cyl.toString()); // 打印 cyl 的描述: 高度、半径、表面积和体积
        System.out.println(cyl1.toString()); // 打印 cyl1 的描述
    }
}
