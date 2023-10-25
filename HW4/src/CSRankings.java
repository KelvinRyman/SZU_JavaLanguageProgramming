import java.util.HashMap;
import java.util.Map;

/**
 * CSRankings 类用于存储和检索与特定研究领域相关的顶级计算机科学会议信息。
 */
public class CSRankings {
    private String researchArea;    // 设置对象属性标签
    private HashMap<String, String> conferences;    // 设置映射字典表

    /**
     * 构造一个 CSRankings 对象，并指定研究领域。
     *
     * @param researchArea 研究领域的名称，例如 "Artificial Intelligence"。
     */
    public CSRankings(String researchArea) {
        this.researchArea = researchArea;
        this.conferences = new HashMap<>();
        initializeConferences();
    }

    /**
     * 初始化会议信息，根据不同的研究领域填充会议名称和网址的映射。
     */
    public void initializeConferences() {
        switch (researchArea) {     // 根据获得的属性来初始化表格
            case "Artificial Intelligence" -> {     // 为 AI 表格注入映射
                conferences.put("AAAI", "dblp.org/db/conf/aaai/index.html");
                conferences.put("IJCAI", "dblp.org/db/conf/ijcai/index.html");
            }
            case "Machine Learning & Data Mining" -> {  // 为 ML & DM 表格注入映射
                conferences.put("ICML", "dblp.org/db/conf/icml/index.html");
                conferences.put("KDD", "dblp.org/db/conf/kdd/index.html");
                conferences.put("NeurIPS", "dblp.org/db/conf/nips/index.html");
            }
            case "The Web & Information Retrieval" -> { // 为 Web & IR 表格注入映射
                conferences.put("SIGIR", "dblp.org/db/conf/sigir/index.html");
                conferences.put("WWW", "dblp.org/db/conf/www/index.html");
            }
            case "Computer Graphics" -> {   // 为 CG 表格注入映射
                conferences.put("SIGGRAPH", "dblp.org/db/conf/siggraph/index.html");
                conferences.put("SIGGRAPH ASIA", "dblp.org/db/conf/siggrapha/index.html");
            }
        }
    }

    /**
     * 返回包含会议名称和网址的字符串表示。
     *
     * @return 包含会议信息的字符串。
     */
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, String> entry : conferences.entrySet()) {    // 遍历表格中的每一个元素并且生成字符串表示
            result.append("会议名称: ").append(entry.getKey()).append("\n网址: ").append(entry.getValue()).append("\n\n");
        }
        return result.toString();
    }
}
