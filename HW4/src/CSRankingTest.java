import java.util.Scanner;

/**
 * 用于测试 CSRankings 类的主类
 */
public class CSRankingTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   // 创建新的 Scanner 实例准备读取用户输入
        String testRankings = scanner.nextLine();
        CSRankings csRankings = new CSRankings(testRankings);   // 利用读取的用户输入来创建 CSRankings类
        System.out.println(csRankings);     // 输出其字符串表示
    }
}
