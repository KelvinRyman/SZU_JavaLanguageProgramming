/**
 * 生成七个 7 位随机数，并判断是否为回文数
 */
public class Hw1ex2 {
    /**
     * 主方法，生成随机数，判断并输出结果
     *
     * @param args 未使用
     */
    public static void main(String[] args) {
        int[] arr = new int[7];     // 声明大小为 7 的整数数组 arr

        for (int i = 0; i < 7; i++) {   // 遍历数组
            arr[i] = getMillion();      // 使用方法得到 7 位的随机数然后初始化数组 arr
            int reverse_num = reverse(arr[i]);  // 使用方法反转得到的随机数

            System.out.printf(arr[i] + " " + reverse_num + " ");    // 输出该随机数和其逆序数

            if (isPalindrome(arr[i])) {     // 使用方法判断该数字是否为回文数
                System.out.println("yes");  // 若是则输出 yes
            } else {
                System.out.println("no");   // 若不是则输出 no
            }
        }
    }

    /**
     * 反转数字的方法
     *
     * @param num 待反转的整数
     * @return 反转后的整数
     */
    public static int reverse(int num) {    // 反转数字的类静态方法
        int rev = 0;    // 初始化结果
        while (num > 0) {
            int digit = num % 10;   // 对数字逐位取余
            num /= 10;
            rev = rev * 10 + digit; // 将其添加到结果中
        }
        return rev;     // 返回结果
    }

    /**
     * 判断数字是否为回文数.
     *
     * @param num 待判断的整数
     * @return 若是回文数则返回 true, 否则返回 false
     */
    public static boolean isPalindrome(int num) {
        if (num % 10 == 0 && num != 0) {    // 先导条件: 若数字尾数为 0 而不是 0 则绝不是回文数
            return false;
        }
        return reverse(num) == num;         // 判断逆序数是否等于原数字
    }

    /**
     * 获取一个 7 位的随机整数
     *
     * @return 7 位随机数
     */
    public static int getMillion() {        // 得到 7 位随机数的方法
        double digit = Math.random() * 1e7; // 用 Math.random() 得到区间[0, 1)内的随机数，使其乘以 1e7
        while (digit <= 1000000 || digit >= 9999999) {  // 若该随机数太小或过大则重新生成，同时维持随机性
            digit = Math.random() * 1e7;
        }
        return (int) digit;     // 返回结果
    }
}
