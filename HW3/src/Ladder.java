/**
 * 代表一个梯形的类，可以设置梯形的上底、下底和高并且计算面积
 */
class Ladder {
    double above, bottom, height;   // Ladder 类的三个数据成员: 上底、下底和高

    /**
     * 无参的构造方法，用于创建默认的梯形对象
     */
    Ladder() {
    }

    /**
     * 有参的构造方法，用给定的上底、下底和高创建一个梯形对象
     *
     * @param a 给定的上底
     * @param b 给定的下底
     * @param h 给定的高
     */
    Ladder(double a, double b, double h) {
        above = a;  // 设置上底的长度
        bottom = b; // 设置下底的长度
        height = h; // 设置高的长度
    }

    /**
     * 设置梯形的上底
     *
     * @param a 新的上底值
     */
    public void setAbove(double a) {
        above = a;  // 设置上底为参数 a
    }

    /**
     * 设置梯形的下底
     *
     * @param b 新的下底值
     */
    public void setBottom(double b) {
        bottom = b; // 设置下底为参数 b
    }

    /**
     * 设置梯形的高
     *
     * @param h 新的高
     */
    public void setHeight(double h) {
        height = h; // 设置高为参数 h
    }

    /**
     * 计算梯形的面积并且返回结果
     *
     * @return 梯形面积
     */
    double computeArea() {
        return (above + bottom) * height / 2.0; // 计算梯形的面积
    }
}
