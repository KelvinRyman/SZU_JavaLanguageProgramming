public class Example4_3 {   // Tom test
    public static void main(String[] args) {
        System.out.println(Tom.MIN);  // 打印 Tom 类的静态常量 MIN，可以直接访问
        //System.out.println(Tom.MAX); // Error, 因为 MAX 不是静态的, 因此不能直接访问
        Tom cat = new Tom();    // 创建 Tom 类的对象 cat
        System.out.println(cat.MAX);    // 通过对象 cat 来访问 Tom 类的静态变量 MAX
    }
}
