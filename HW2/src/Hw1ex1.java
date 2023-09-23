import java.util.Arrays;

/**
 * 生成并排序三维数组中的前 15 个最大数字，并计算程序执行时间.
 * 其总体的时间复杂度为 O(xSize * ySize * zSize * 15 * log(15)) = O(1e8 * 15 * log(15))
 */
public class Hw1ex1 {
    /**
     * 主方法，生成三维数组，提取并排序前 15 个最大数字，然后计算程序执行时间
     *
     * @param args 未使用的命令行参数
     */
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();    // 记录程序的开始时间
        int xSize = 1000, ySize = 100, zSize = 1000;    // 记录三维数组的大小
        float[][][] array = new float[xSize][ySize][zSize]; // 声明三维数组
        for (int i = 0; i < xSize; ++i) {                   // 循环遍历整个三维数组并且赋值
            for (int j = 0; j < ySize; ++j) {
                for (int k = 0; k < zSize; ++k) {
                    array[i][j][k] = (float) Math.random(); // 使用 Math.random() 方法生成随机数并且转换为单精度浮点数
                }
            }
        }

        float[] top15 = new float[15];  // 声明最大 15 个数字的数组
        int count = 0;                  // 计算 top15 数组已经记录了多少个数字
        for (int i = 0; i < xSize; ++i) {
            for (int j = 0; j < ySize; ++j) {
                for (int k = 0; k < zSize; ++k) {
                    float num = array[i][j][k];     // 获取 array 数组的每个元素
                    if (count < 15) {
                        top15[0] = num;     // 当 top15 没有被完全赋值的时候，将当前元素加入 top15 数组中
                        count += 1;             // 使 count 自增
                        Arrays.sort(top15);     // 部分排序，维持 top15 数组的有序性
                    } else if (num > top15[14]) {    // 当该数字大于最大数字时
                        for (int z = 14; z >= 1; --z) {
                            top15[z] = top15[z - 1];    // 将除最大数字之外的数字全部左移
                        }
                        top15[0] = num;         // 将最大数字更改
                    } else if (num > top15[0]) {   // 当该数字大于 top15 最小数字时候
                        top15[0] = num;    // 直接更改最小数字
                        Arrays.sort(top15); // 局部排序，维持 top15 数组的有序性
                    }
                }
            }
        }
        Arrays.sort(top15); // 全部排序，维持 top15 数组的有序性

        for (int i = 14; i >= 0; --i) {
            System.out.println(top15[i]);     // 逐个遍历打印 top15 数组
        }
        System.out.println();

        long endTime = System.currentTimeMillis();  // 记录程序完成的时间
        long time = endTime - startTime;    // 将完成时间 - 开始时间则得到程序的运行时间，单位为毫秒
        System.out.println("execution time: " + time + "ms");   // 打印执行时间
    }
}
