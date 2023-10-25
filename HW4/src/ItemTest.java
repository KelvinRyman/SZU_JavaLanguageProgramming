/**
 * 用于测试 Item 类的主类
 */
public class ItemTest {
    public static void main(String[] args) {
        // 创建三个在 2023 年亚运会中奖牌数最多的项目作为 Item 对象
        Item item1 = new Item("田径", "杭州奥体中心体育场", 48);
        Item item2 = new Item("游泳", "淳安界首体育中心游泳赛场", 41);
        Item item3 = new Item("射击", "富阳银湖体育中心", 33);

        // 打印第一个赛事项目的信息
        System.out.println("赛事名称: " + item1.getName());
        System.out.println("赛事场地: " + item1.getVenue());
        System.out.println("共产生奖牌数: " + item1.getMedal());
        System.out.println();

        // 打印第二个赛事项目的信息
        System.out.println("赛事名称: " + item2.getName());
        System.out.println("赛事场地: " + item2.getVenue());
        System.out.println("共产生奖牌数: " + item2.getMedal());
        System.out.println();

        // 打印第三个赛事项目的信息
        System.out.println("赛事名称: " + item3.getName());
        System.out.println("赛事场地: " + item3.getVenue());
        System.out.println("共产生奖牌数: " + item3.getMedal());
        System.out.println();
    }
}
