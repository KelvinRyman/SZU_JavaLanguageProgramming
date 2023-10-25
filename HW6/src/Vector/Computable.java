package Vector;

public interface Computable {   // Computable 接口定义了一些向量操作的静态方法
    // 向量相加
    static Vector add(Vector x, Vector y) {
        Vector z = new Vector(0, 0, 0, 0);
        for (int i = 0; i < 4; i++) {
            z.setDigit(x.getDigit(i) + y.getDigit(i), i);
        }
        return z;
    }

    // 向量相减
    static Vector minus(Vector x, Vector y) {
        Vector z = new Vector(0, 0, 0, 0);
        for (int i = 0; i < 4; i++) {
            z.setDigit(x.getDigit(i) - y.getDigit(i), i);
        }
        return z;
    }

    // 逐元素的相乘
    static Vector elementwiseProduct(Vector x, Vector y) {
        Vector z = new Vector(0, 0, 0, 0);
        for (int i = 0; i < 4; i++) {
            z.setDigit(x.getDigit(i) * y.getDigit(i), i);
        }
        return z;
    }

    // 求取内积
    static double innerProduct(Vector x, Vector y) {
        double sum = 0;
        for (int i = 0; i < 4; i++) {
            sum += x.getDigit(i) * y.getDigit(i);
        }
        return sum;
    }

    // 求取模
    static double norm(Vector x) {
        double norm = 0;
        for (int i = 0; i < 4; i++) {
            norm += x.getDigit(i) * x.getDigit(i);
        }
        norm = Math.sqrt(norm);
        return ((double) ((int) norm * 100)) / 100;
    }

    // 获得字符串表示
    String toString();
}
