/**
 * 代表一个三维盒子的类，可以设置其尺寸、计算体积和表面积，并生成描述字符串。
 */
public class Box {
    private int length; // box 的长度
    private int width;  // box 的宽度
    private int height; // box 的高度

    /**
     * 设置盒子的尺寸
     *
     * @param l 长度
     * @param w 宽度
     * @param h 高度
     */
    public void setInfo(int l, int w, int h) {
        length = l;   // 设置长度
        width = w;    // 设置宽度
        height = h;   // 设置高度
    }

    /**
     * 计算盒子的体积
     *
     * @return 盒子的体积
     */
    public int getVolume() {
        return length * width * height; // 按照体积计算公式来计算：长度 x 宽度 x 高度;
    }

    /**
     * 计算盒子的表面积
     *
     * @return 盒子的表面积
     */
    public int area() {
        return 2 * (length * width + width * height + height * length);
        // 按照表面积计算公式来计算：2 * (长x宽 + 宽x高 + 高x长)
    }

    /**
     * 生成描述盒子的字符串，包括尺寸、体积、表面积
     *
     * @return 描述盒子的字符串
     */
    public String toString() {
        return "length: " + length + ", width: " + width + ", height: " + height + "\n" +
                "volume: " + getVolume() + ", area: " + area(); // 返回长宽高、体积和表面积
    }
}
