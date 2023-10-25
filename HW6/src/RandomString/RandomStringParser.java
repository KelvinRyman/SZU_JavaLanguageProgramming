package RandomString;

import java.util.Random;

public class RandomStringParser {
    private char[] str;             // 存储随机生成的字符串
    private String numbers;         // 存储提取的数字
    private String LowerLetters;    // 存储提取的小写字母
    private String UpperLetters;    // 存储提取的大写字母

    // 构造函数，在构造的时候就生成随机字符串并提取各类字符
    public RandomStringParser(int length) {
        generateRandomString(length);
        extractNumbers();
        extractLowerLetters();
        extractUpperLetters();
    }

    // 依次打印提取出来的各类字符
    public void printResult() {
        System.out.println(String.valueOf(str));
        System.out.println(numbers);
        System.out.println(LowerLetters);
        System.out.println(UpperLetters);
    }

    // 按照给出的长度生成随机字符串
    private void generateRandomString(int length) {
        // 自定义的字符表
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int N = characters.length();
        // 利用 random 生成随机数取得表中的字符
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(characters.charAt(random.nextInt(N)));
        }
        str = sb.toString().toCharArray();
    }

    // 提取数字
    private void extractNumbers() {
        StringBuilder nums = new StringBuilder();
        for (char ch : str) {
            // 依次遍历字符数组并且判断，若是数字则存储，下面原理相同
            if (Character.isDigit(ch)) {
                nums.append(ch);
            }
        }
        numbers = nums.toString();
    }

    // 提取小写字母
    private void extractLowerLetters() {
        StringBuilder lowerLetters = new StringBuilder();
        for (char ch : str) {
            if (Character.isLowerCase(ch)) {
                lowerLetters.append(ch);
            }
        }
        LowerLetters = lowerLetters.toString();
    }

    // 提取大写字母
    private void extractUpperLetters() {
        StringBuilder upperLetters = new StringBuilder();
        for (char ch : str) {
            if (Character.isUpperCase(ch)) {
                upperLetters.append(ch);
            }
        }
        UpperLetters = upperLetters.toString();
    }
}
