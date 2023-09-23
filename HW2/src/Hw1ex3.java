import java.util.Scanner;

/**
 * 从键盘输入 15 个整数，将其存储到一个一维数组中，
 * 并将数组的前 5 个元素与后 5 个元素互换位置后输出。
 */
public class Hw1ex3 {
    /**
     * 主方法，用于执行程序的输入、数组操作和输出.
     *
     * @param args 未使用的命令行参数
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 实例化 Scanner 对象
        int[] arr = new int[15];    // 声明长度为 15 的数组
        for (int i = 0; i < 15; i++) {
            arr[i] = sc.nextInt();  // 遍历数组，利用 Scanner 获取 15 个整数，并将其存储到数组中
        }

        for (int i = 0; i < 5; i++) {
            int temp = arr[14 - i]; // 遍历数组，使前五个元素和最后五个元素交换
            arr[14 - i] = arr[i];
            arr[i] = temp;
        }

        for (int i = 0; i < 15; i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(arr[i]);   // 将数组中的元素逐个输出
        }
    }
}
