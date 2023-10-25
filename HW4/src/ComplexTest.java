/**
 * 用于测试 Complex 类的主类
 */
public class ComplexTest {
    public static void main(String[] args) {
        Complex a = new Complex(4, 5);  // 创建一个复数对象，实部为 4，虚部为 5
        Complex b = new Complex(2, 3);  // 创建一个复数对象，实部为 2，虚部为 3
        Complex sum = a.complexAdd(b);  // 调用复数对象的 complexAdd() 方法，计算两个复数的和
        Complex product = a.complexMult(b); // 调用复数对象的 complexMult() 方法，计算两个复数的积
        System.out.println(a);  // 直接输出复数对象，会调用其 toString() 方法
        System.out.println(b);
        System.out.println(sum.toString());   // 也可以显式地调用 toString() 方法
        System.out.println(product.toString());
    }
}
