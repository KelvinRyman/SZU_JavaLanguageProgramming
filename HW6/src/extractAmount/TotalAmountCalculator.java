package extractAmount;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TotalAmountCalculator {
    private final String STR;
    private static final long UNIT_10K = 10_000L;   // 给出单位常量
    private static final long UNIT_100M = 100_000_000L;

    // 构造函数，接受一个字符串作为输入
    public TotalAmountCalculator(String STR) {
        this.STR = STR;
    }

    // 提取并计算总金额的方法
    public void extract() {
        // 创建正则表达式模式，用于匹配金额数字
        Pattern pattern = Pattern.compile("(\\d+(\\.\\d+)?)[万亿]?");
        // 创建匹配器，用于在输入字符串中查找匹配的数字
        Matcher matcher = pattern.matcher(STR);

        // 初始化总金额为 0
        long sum = 0;

        // 遍历匹配结果
        while (matcher.find()) {
            // 获取匹配的数字，即匹配组 1
            String match = matcher.group(1);
            // 获取整个匹配的字符串
            String s = matcher.group();
            // 确定单位进行计算
            if (s.contains("万")) {
                sum += Long.parseLong(match) * UNIT_10K;
            } else if (s.contains("亿")) {
                sum += Long.parseLong(match) * UNIT_100M;
            } else {
                sum += Long.parseLong(match);
            }
        }
        System.out.println("totalAmount: " + sum);
    }
}
