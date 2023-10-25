package test;

import static Vector.Computable.add;
import static Vector.Computable.elementwiseProduct;
import static Vector.Computable.innerProduct;
import static Vector.Computable.minus;
import static Vector.Computable.norm;

import Vector.Vector;

public class VectorTest {
    public static void main(String[] args) {
        // 创建两个 Vector 对象 a 和 b
        Vector a = new Vector(new double[]{3, 9, 2, 7});
        Vector b = new Vector(2, -8, -1, 6);

        // 输出向量操作的结果
        System.out.println(add(a, b));
        System.out.println(minus(a, b));
        System.out.println(elementwiseProduct(a, b));
        System.out.println(innerProduct(a, b));
        System.out.println(norm(new Vector(5, 2, 1, 8)));
    }
}
