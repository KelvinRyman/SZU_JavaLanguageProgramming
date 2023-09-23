/**
 * 查找并输出在 1~1024 范围内的所有完数
 */
public class Hw1ex5 {
    /**
     * 主方法，用于查找输出在 1~1024 范围内的所有完数
     *
     * @param args 未使用的命令行参数
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 1024; i++) {   // 遍历 1~1024 中的所有整数
            if (isPerfectNumber(i)) {   // 用方法判断该数字是否为完数
                System.out.println(i);  // 如果该数字为完数，则输出
                System.out.print(i + "'s Factors:");    // 输出因子的提示
                printFactors(i);        // 输出这个完数的所有因子
            }
        }
    }

    /**
     * 判断一个整数是否为完数.
     * 完数: 指一个整数等于其所有正因子之和（不包括自身）的数.
     *
     * @param num 待判断的整数
     * @return 如果是完数返回 true, 否则范围 false
     */
    public static boolean isPerfectNumber(int num) {
        int sum = 0;    // 初始化结果为 0
        for (int i = 1; i <= num / 2; i++) {
            /* 一个整数除其自身之外，最大的因子即为该数字除以2，因此将上限设为 num / 2 避免无用的运算 */
            if (num % i == 0) {
                sum += i;   // 若这个整数可以整除遍历到的数字，则可知这个数字即为其因子
            }
        }
        return sum == num;  // 若所有正因子的和等于该数字，则返回 true
    }

    /**
     * 输出给定数字的所有因子.
     * @param num 需要找出因子的数字，应为一个正整数
     */
    public static void printFactors(int num) {
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                if (i > 1) {
                    System.out.print(" ");
                }
                System.out.print(i);
            }
        }
        System.out.println();
    }
}
