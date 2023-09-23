/**
 * 代表一个梯形的类 Ladder1
 */
class Ladder1 {
    static double bottom; // 静态变量，用于存储梯形的下底，并且为所有实例共享
    double above, height; // 实例变量，用于存储梯形的上底和高度，每个实例都拥有其副本

    /**
     * 获取梯形的上底
     *
     * @return 梯形的上底
     */
    double getAbove() {
        return above;   // 返回梯形的上底
    }

    /**
     * 设置梯形的上底
     *
     * @param a 新的上底值
     */
    void setAbove(double a) {
        above = a;      // 设置梯形的上底为新的上底值
    }

    /**
     * 获取梯形的下底
     *
     * @return 梯形的下底
     */
    double getBottom() {
        return bottom;  // 返回梯形的下底
    }

    /**
     * 设置梯形的下底
     *
     * @param b 新的下底值
     */
    void setBottom(double b) {
        bottom = b;     // 设置梯形的下底为新的下底值
    }
}