public class Example4_1 {   // Ladder test
    public static void main(String[] args) {
        double area1 = 0, area2 = 0;    // 初始化两个面积值，用于之后存储梯形的面积
        Ladder ladderOne, ladderTwo;    // 初始化两个 Ladder 对象的引用
        ladderOne = new Ladder();       // 利用无参构造方法构造第一个 Ladder 对象，将其引用赋值给 ladderOne
        ladderTwo = new Ladder(10, 88, 20); // 利用有参构造方法构造第二个 Ladder 对象，将其引用赋值给 ladderTwo
        ladderOne.setAbove(16);         // 设置第一个梯形的上底
        ladderOne.setBottom(26);        // 设置第一个梯形的下底
        ladderOne.setHeight(100);       // 设置第一个梯形的高
        ladderTwo.setAbove(300);        // 设置第二个梯形的上底
        ladderTwo.setBottom(500);       // 设置第二个梯形的下底
        area1 = ladderOne.computeArea();    // 计算第一个梯形的面积并存储在 area1 中
        area2 = ladderTwo.computeArea();    // 计算第二个梯形的面积并存储在 area2 中
        System.out.println(area1);      // 打印出第一个梯形的面积
        System.out.println(area2);      // 打印出第二个梯形的面积
    }
}