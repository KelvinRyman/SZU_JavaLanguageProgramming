package Vector;

import java.util.Arrays;

// Vector 类实现了 Computable 接口
public class Vector implements Computable {
    private final double[] digits;

    // 构造方法，利用四个参数初始化向量
    public Vector(double n1, double n2, double n3, double n4) {
        digits = new double[4];
        digits[0] = n1;
        digits[1] = n2;
        digits[2] = n3;
        digits[3] = n4;
    }

    // 构造方法，利用数组初始化向量
    public Vector(double[] arr) {
        if (arr.length != 4) {
            digits = new double[4];
            System.arraycopy(arr, 0, digits, 0, 4);
        } else {
            digits = arr;
        }
    }

    // getter 方法，用于获取向量的一个分量
    public double getDigit(int index) {
        return digits[index];
    }

    // setter 方法，用于设置向量的一个分量
    public void setDigit(double n, int index) {
        digits[index] = n;
    }

    // 字符串表示
    @Override
    public String toString() {
        return Arrays.toString(digits);
    }
}
