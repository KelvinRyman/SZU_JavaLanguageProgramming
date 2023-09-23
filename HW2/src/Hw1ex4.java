/**
 * 在三位数中寻找所有的水仙花数
 */
public class Hw1ex4 {
    /**
     * 主方法，遍历所有三位数并用方法判断是否为水仙花数.
     *
     * @param args 未使用的命令行参数
     */
    public static void main(String[] args) {
        for (int i = 100; i < 999; i++) {   // 遍历 100~999 的所有三位数
            if (isNarcissistic(i)) {        // 用方法判断是否为水仙花数
                System.out.println(i);      // 若是，则输出该数字
            }
        }
    }

    /**
     * 判断一个整数是否为水仙花数的方法.
     *
     * @param num 待判断的整数
     * @return 若是水仙花数则返回 true, 否则返回 false
     */
    public static boolean isNarcissistic(int num) {
        int origin = num;   // 存储待判断的数字
        int digit0 = num % 10;  // 利用取余的的方法获取其个位数字
        num /= 10;  // 去除其各位数字
        int digit1 = num % 10;  // 利用取余的的方法获取其十位数字
        num /= 10;  // 去除其十位数字
        int digit2 = num % 10;  // 利用取余的的方法获取其百位数字
        return Math.pow(digit0, 3) + Math.pow(digit1, 3) + Math.pow(digit2, 3) == origin;
        // 利用 Math.pow() 方法求立方，判断其是否与原数字相等，若相等则为水仙花数
    }
}
