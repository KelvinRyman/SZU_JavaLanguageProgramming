/**
 * 表示一个运动员的信息，包括姓名、性别、年龄、项目、奖牌数
 */
public class Athlete {
    private String name;    // 姓名
    private String gender;  // 性别
    private int age;        // 年龄
    private String item;    // 擅长的项目
    private int medal;      // 奖牌数

    /**
     * 设置运动员的姓名
     * @param name 要设置的姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 设置运动员的性别
     * @param gender 要设置的性别
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 设置运动员的年龄
     * @param age 要设置的年龄
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 设置运动员的项目
     * @param item 要设置的项目
     */
    public void setItem(String item) {
        this.item = item;
    }

    /**
     * 设置运动员的奖牌数
     * @param medal 要设置的奖牌数
     */
    public void setMedal(int medal) {
        this.medal = medal;
    }

    /**
     * 返回运动员的信息，包括姓名、性别、年龄、项目和奖牌数量
     * @return 运动员的信息
     */
    public String toString() {
        return "Name: " + name + "\n" + "Gender: " + gender + "\n" + "Age: " + age + "\n" + "Item: " + item + "\n" + "Medal: " + medal + "\n";
    }
}
