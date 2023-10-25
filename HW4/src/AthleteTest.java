/**
 * 用于测试 Athlete 类的主类
 */
public class AthleteTest {
    public static void main(String[] args) {
        // 创建五个运动员实例，并且设置其信息为2023杭州亚运会中国队前三块金牌获得者
        // 注意：由于有两块金牌为双人金牌金牌，因此有 5 位运动员
        Athlete athlete1 = new Athlete();
        Athlete athlete2 = new Athlete();
        Athlete athlete3 = new Athlete();
        Athlete athlete4 = new Athlete();
        Athlete athlete5 = new Athlete();

        // 设置第一位运动员的信息
        athlete1.setName("邹佳琪");
        athlete1.setGender("女");
        athlete1.setAge(21);
        athlete1.setItem("女子轻量级双人双桨");
        athlete1.setMedal(1);

        // 设置第二位运动员的信息
        athlete2.setName("邱秀萍");
        athlete2.setAge(23);
        athlete2.setGender("女");
        athlete2.setItem("女子轻量级双人双桨");
        athlete2.setMedal(1);

        // 设置第三位运动员的信息
        athlete3.setName("孙培原");
        athlete3.setItem("男子长拳");
        athlete3.setAge(34);
        athlete3.setGender("男");
        athlete3.setMedal(1);

        // 设置第四位运动员的信息
        athlete4.setName("范俊杰");
        athlete4.setItem("男子轻量级双人双桨");
        athlete4.setAge(28);
        athlete4.setGender("男");
        athlete4.setMedal(1);

        // 设置第五位运动员的信息
        athlete5.setName("孙满");
        athlete5.setItem("男子轻量级双人双桨");
        athlete5.setAge(28);
        athlete5.setGender("男");
        athlete5.setMedal(1);

        // 利用 toString() 方法直接输出五位运动员的信息
        System.out.println(athlete1);
        System.out.println(athlete2);
        System.out.println(athlete3);
        System.out.println(athlete4);
        System.out.println(athlete5);
    }
}
