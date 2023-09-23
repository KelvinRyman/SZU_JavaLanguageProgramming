public class Example4_2_1 {     // Ladder1 test

    public static void main(String[] args) {
        Ladder1.bottom = 60;   // 设置 Ladder1 类的静态变量 bottom 为 60
        Ladder1 ladderOne, ladderTwo;   // 声明两个 Ladder1 类的对象引用

        System.out.println(Ladder1.bottom);   // 打印 Ladder1 类的静态变量 bottom 的值

        ladderOne = new Ladder1();   // 创建第一个 Ladder1 对象
        ladderTwo = new Ladder1();   // 创建第二个 Ladder1 对象

        System.out.println(ladderOne.getBottom());
        // 打印第一个梯形对象的下底，因为静态变量 bottom 在所有实例之间共享，所以这里打印的是 60
        System.out.println(ladderTwo.getBottom());
        // 打印第二个梯形对象的下底，同样是 60

        ladderOne.setAbove(11);   // 设置第一个梯形对象的上底为 11
        ladderTwo.setAbove(22);   // 设置第二个梯形对象的上底为 22
        ladderTwo.setBottom(100);  // 设置第二个梯形对象的下底为 100

        System.out.println(Ladder1.bottom);
        // 再次打印 Ladder1 类的静态变量 bottom 的值，此时为 100，因为被第二个梯形对象修改了
        System.out.println(ladderOne.getAbove());   // 打印第一个梯形对象的上底，为 11
        System.out.println(ladderTwo.getAbove());   // 打印第二个梯形对象的上底，为 22
    }
}
