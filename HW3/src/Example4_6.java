public class Example4_6 {   // PostGraduateStudent test

    public static void main(String[] args) {
        PostGraduateStudent stu = new PostGraduateStudent("2022270098", "Zhang San", 90, 80, 70);
        // 创建一个研究生类的对象 stu, 传入学生和三门课程的分数
        System.out.println("ID: " + stu.getID());   // 打印学生的学号
        System.out.println("Name: " + stu.getName());   // 打印学生的名字
        System.out.println("Sum: " + stu.comSum()); // 打印学生的总分
        System.out.println("Avg: " + stu.comAvg()); // 打印学生的平均分
        System.out.println("Max: " + stu.comMax()); // 打印学生的最高分
    }
}
