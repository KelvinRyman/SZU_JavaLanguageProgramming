public class Example4_2 {   // Circle test
    public static void main(String[] args) {
        Circle circle;  // 声明一个 Circle 类的对象的引用
        circle = new Circle();  // 创建一个 Circle 类的对象，并且将其引用赋值给 circle
        circle.radius = 1;  // 设置圆的半径为 1
        double area = circle.getArea(); // 调用 Circle 类的 getArea() 方法来计算圆的面积并将其赋值给 area 变量
        System.out.println(area);   // 打印圆的面积
    }
}