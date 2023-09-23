class Circle {
    double radius;  // 用于存储圆的半径值

    /**
     * 计算圆的面积的方法
     *
     * @return 圆的面积
     */
    double getArea() {
        double area = 3.14 * radius * radius;   // 利用圆的面积公式计算圆的面积
        return area;    // 返回计算得到的圆的面积
    }
}

