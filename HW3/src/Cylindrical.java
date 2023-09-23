/**
 * 代表一个圆柱体的类，包括半径和高度信息，可以计算体积和表面积，并生成描述字符串
 */
public class Cylindrical {
    private double radius;  // 圆柱体的半径
    private double height;  // 圆柱体的高度

    /**
     * 无参构造方法，创建一个默认的圆柱体对象
     */
    public Cylindrical() {
    }

    /**
     * 构造方法，用给定的半径和高度来创建一个圆柱体对象
     *
     * @param r 圆柱体的半径
     * @param h 圆柱体的高度
     */
    public Cylindrical(double r, double h) {
        radius = r; // 设置实例的半径为给定的半径
        height = h; // 设置实例的高度为给定的高度
    }

    /**
     * 设置圆柱体的半径和高度
     *
     * @param r 圆柱体的半径
     * @param h 圆柱体的高度
     */
    public void setInfo(double r, double h) {
        radius = r; // 设置实例的半径为给定的半径
        height = h; // 设置实例的高度为给定的高度
    }

    /**
     * 计算圆柱体的体积
     *
     * @return 圆柱体的体积
     */
    public double getVolume() {
        return Math.PI * radius * radius * height;  // 利用公式计算，体积 = PI * radius^2 * height
    }

    /**
     * 计算圆柱体的表面积
     *
     * @return 圆柱体的表面积
     */
    public double area() {
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
        // 利用公式计算，表面积 = 底面积 * 2 + 侧面积
    }

    /**
     * 生成描述圆柱体的字符串，包括半径、高度、体积和表面积
     *
     * @return 描述字符串
     */
    public String toString() {
        return "radius: " + radius + ", height: " + height + "\n" +
                "volume: " + getVolume() + ", area: " + area(); // 返回半径、高度、体积和表面积
    }
}
