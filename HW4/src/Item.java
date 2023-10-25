/**
 * 表示一个大型体育赛事中的项目
 */
public class Item {
    private final String name;  // 赛事名称
    private final String venue; // 赛事场地
    private final int medal;    // 该赛事产生的奖牌数

    /**
     * 构造一个赛事项目
     * @param name 赛事名称
     * @param venue 赛事场地
     * @param medal 该赛事产生的奖牌数
     */
    public Item(String name, String venue, int medal) {
        this.name = name;
        this.venue = venue;
        this.medal = medal;
    }

    /**
     * 获取赛事名称
     * @return 赛事名称
     */
    public String getName() {
        return name;
    }

    /**
     * 获取赛事场地
     * @return 赛事场地
     */
    public String getVenue() {
        return venue;
    }

    /**
     * 获取该赛事产生的奖牌数
     * @return 该赛事产生的奖牌数
     */
    public int getMedal() {
        return medal;
    }
}
