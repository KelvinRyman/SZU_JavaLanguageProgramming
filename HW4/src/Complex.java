/**
 * 表示复数的的类，包括实数部分和虚数部分
 */
public class Complex {
    private double realPart;    // 实部
    private double imagePart;   // 虚部

    /**
     * 构造一个复数对象，指定实部和虚部
     *
     * @param r 实部
     * @param i 虚部
     */
    public Complex(double r, double i) {
        realPart = r;   // 实部
        imagePart = i;  // 虚部
    }

    /**
     * 设置实部的值
     *
     * @param r 待设置的实部的值
     */
    public void setRealPart(double r) {
        realPart = r;
    }

    /**
     * 设置虚部的值
     *
     * @param i 待设置的虚部的值
     */
    public void setImagePart(double i) {
        imagePart = i;
    }

    /**
     * 进行复数的加法运算操作
     *
     * @param c 待相加的复数
     * @return 一个新的复数，是两个复数的和
     */
    public Complex complexAdd(Complex c) {
        return new Complex(realPart + c.realPart, imagePart + c.imagePart);
    }

    /**
     * 进行复数的乘法运算操作
     *
     * @param c 待相乘的复数
     * @return 一个新的复数，是两个复数的积
     */
    public Complex complexMult(Complex c) {     // 利用公式进行计算，对于复数 a+bi 和 c+di，其积为 (ac-bd)+(ad+bc)i
        return new Complex(realPart * c.realPart - imagePart * c.imagePart,
                imagePart * c.realPart + realPart * c.imagePart);
    }

    /**
     * 返回复数的字符串表示，例如 "3.0 + 5.0i"
     *
     * @return 复数的字符串表示
     */
    public String toString() {
        return realPart + "+" + imagePart + "i";
    }
}
