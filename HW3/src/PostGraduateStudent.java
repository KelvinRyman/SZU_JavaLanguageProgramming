/**
 * 代表一位研究生的类，其中包含了这位研究生的姓名、学号和三门课程的分数
 */
public class PostGraduateStudent {
    private final String ID;    // 学生的学号
    private final String name;  // 学生的名字
    private final double math;  // 学生的数学分数
    private final double programming;   // 学生的编程分数
    private final double english;   // 学生的英语分数

    /**
     * 有参的构造方法，用于初始化学生的信息和分数
     *
     * @param id  学生的学号
     * @param nm  学生的名字
     * @param mt  数学课程分数
     * @param prg 编程课程分数
     * @param eng 英语课程分数
     */
    public PostGraduateStudent(String id, String nm, double mt, double prg, double eng) {
        ID = id;    // 将五项信息设置为实例的数据
        name = nm;
        math = mt;
        programming = prg;
        english = eng;
    }

    /**
     * 获取学生的学号
     *
     * @return 学生的学号
     */
    public String getID() {
        return ID;  // 返回学生的学号
    }

    /**
     * 获取学生的姓名
     *
     * @return 学生的姓名
     */
    public String getName() {
        return name;    // 返回学生的姓名
    }

    /**
     * 计算学生三门课程分数的总和
     *
     * @return 总分
     */
    public double comSum() {
        return math + programming + english;    // 返回三门课程分数之和
    }

    /**
     * 计算三门课程分数的平均值
     *
     * @return 平均分
     */
    public double comAvg() {
        return comSum() / 3.0;  // 调用 comSum() 方法得到总分然后除以 3.0 来取得平均分
    }

    /**
     * 获得三门课程分数的最高分
     *
     * @return 三门课程分数的最高分
     */
    public double comMax() {
        return Math.max(Math.max(math, programming), english);  // 利用 Math.max 方法来获得三门课程分数中的最大值
    }
}
