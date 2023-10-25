package ArticleAnalyze;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class ArticleWordAnalyzer {
    // 用于存储单词的优先队列，队列中的单词按照出现次数从小到大排序
    // （为了排除出现次数最小的单词，完成后会反转排序），
    // 如果出现次数相同则按照字典序从小到大排序
    private final PriorityQueue<Map.Entry<String, Integer>> wordQueue = new PriorityQueue<>((a, b) -> a.getValue().equals(b.getValue()) ? b.getKey().compareTo(a.getKey()) : a.getValue().compareTo(b.getValue()));
    // 用于存储单词及其出现次数的哈希表
    private final HashMap<String, Integer> wordMap = new HashMap<>();

    // 构造函数，初始化分析器
    public ArticleWordAnalyzer() {
        initAnalyzer();
        initQueue();
        printQueueCount();
    }

    // 初始化分析器，输入文章，并将文章中的单词及其出现次数存储到哈希表中
    private void initAnalyzer() {
        wordMap.clear();
        String article = """
                Key institutes
                SZU Natural Sciences & Engineering & Medicine Research Institutions

                State Key Laboratory of Radio Frequency Heterogeneous Integration

                Key Laboratory of Optoelectronic Devices and Systems of Ministry of Education and Guangdong Province, Shenzhen University

                International Collaborative Laboratory of 2D Materials for Optoelectronics Science and Technology

                Carson International Cancer Stem Cell Vaccine R&D Base

                Local Joint Laboratory for Engineering of National Key Technology of Medical Ultrasound

                Research Center for National Biochemical Engineering Technology (Ministry of Science and Technology)

                Local Joint Engineering of Laboratory for Key Technologies in the Application of Medical Synthetic Biology

                National Engineering Laboratory of Big Data System Computing Technology

                Shenzhen University Branch of ATR National Defense Science and Technology Key Laboratory (Intelligent Information Processing Guangdong Provincial Key Laboratory)

                Key Laboratory of Advanced Optical Precision Manufacturing Technology of Guangdong Higher Education Institutes，Shenzhen University

                Key Laboratory of Biomedical Information Detection and Ultrasound Imaging of Guangdong Province

                Key Laboratory of Coastal Civil Engineering Durability of Guangdong Province

                Key Laboratory of Popular Type of High-performance Computer of Guangdong province

                Key Laboratory of National Surveying and Mapping Geographic Information Bureau for Coastal Environment Monitoring

                Research Center for Allergy Standardized Technology of Guangdong Province

                Big Data Analysis Engineering Technology Research Center of Universities in Guangdong

                Guangdong Provincial Big Data Collaborative Innovation Center, Shenzhen University

                The HD Video R & D Platform for Intelligent Analysis and Processing in Guangdong Engineering Technology Research Centre of Colleges and Universities (No.GCZX-A1409)

                Research on Core Issues of Advanced Civil Engineering Materials in Coastal Environment (Sino-Dutch Advanced Civil Engineering

                Materials Joint Laboratory)

                China-UK Joint Research Lab on Visual Information Processing

                Civil Engineering Materials and Structural Safety in Coastal Area Key Laboratory of Ministry of Education and Provincial Department

                Guangdong Provincial Key Laboratory for Plant Epigenetics

                Guangdong Research Center for Interface Engineering of Functional Materials

                Guangdong Provincial Mobile Internet Application Middleware Engineering Technology Research Center

                Guangdong Provincial Key Laboratory of Micro/Nano Optomechatronics Engineering

                Guangdong Provincial Key Laboratory for Plant Epigenetics

                Guangdong and Hong Kong Joint Research Centre for Optical Fibre Sensors

                Study on Preparation and Photoelectric Characteristics of Van Der Waals Force Stacking, Tomic Thickness, Ayered Composite Two-dimensional

                Tomic Crystals (SZU-NUS optoelectronic Technology Collaborative Innovation Center)

                Research on Nano-resolution Optical Information Acquisition Technology (Advanced Nano-biomedical Photonics Microscopic Imaging platform)

                International Collaborative Laboratory of 2D Materials for Optoelectronics Science and Technology

                Guangdong Provincial Engineering Technology Research Center of Base Station Antennas and Propagation

                Medical Electronic Instrument Transformation Engineering Technology Research Center of Guangdong Province

                The Guangdong Wireless Big Data and Future Network Research Center

                Maternal Child Health Monitoring and Early Warning Engineering Technology Research Center of Guangdong Province

                Guangdong Key Laboratory of Intelligent Information Processing

                Key laboratory of Genome Stability and Disease Control of Guangdong Province

                Guangdong Breath Test Engineering Technology Research Center

                Guangdong Provincial (SZU-DAS) Positioning & Sensing Engineering Technology Research Center

                3D Content Creation Engineering Technology Research Center of Guangdong Province

                Guangdong Province Engineering Center of China-made High Performance Data Computing System

                Guangdong Provincial Mobile Terminal Microwave and Millimeter-Wave Antenna Engineering Research Center

                Engineering Technology Research Center for 2D Material Information Function Devices and Systems of Guangdong Province

                Guangdong Provincial Engineering Center for Ubiquitous Computing and Intelligent Networking

                Natural Small Molecular Innovation Pharmaceutical Engineering Technology Research Center of Guangdong Province

                Guangdong Flexible Wearable Energy Tools Engineering Technology Research Centre

                Guangdong Key Laboratory of Urban Informatics



                SZU Humanities & Social Sciences Research Institutions

                China Center for Special Economic Zone Research, Shenzhen University (having itsownwebsite )

                Center for Basic Laws of Hong Kong and Macao Special Adminstrative Regions, Shenzhen University (having itsownwebsite )

                Institute for Cultural Industries, Shenzhen University (having itsownwebsite )

                Jao Tsung-IInstitute of Culture Studies, Shenzhen University

                Institute of Urban Governance, Shenzhen University (having itsownwebsite )

                TheCenter for Media and Social Changes, Shenzhen University (having itsownwebsite )

                Research Base for Theories on Judicial Protection of Intellectual Property

                Institute of Aesthetics and Literary Criticism

                Immigration Culture Research Center of Shenzhen University (having itsownwebsite )

                Institute of Sports Culture (having itsownwebsite )

                Shenzhen Research Center for Modern Art and Design

                Shenzhen Research Center for International Development Strategy (having itsownwebsite )

                Research Center for Special Economic Zone Legislation

                Research Center for Innovation and Development of the Rule of Law

                Institute of Quality Economic Development

                Institute of Ecological Civilization

                """;
        // 以空符号为分隔符，将文章分割成单词
        String[] words = article.split("\\s+");
        // 将单词中的标点符号去除，并将单词转换为小写
        for (String word : words) {
            word = word.replaceAll("[(),\n]", "").toLowerCase();
            if (wordMap.containsKey(word)) {
                wordMap.put(word, wordMap.get(word) + 1);
            } else if (!word.isEmpty()) {
                wordMap.put(word, 1);
            }
        }
    }

    // 初始化优先队列，将哈希表中的单词及其出现次数存储到优先队列中
    private void initQueue() {
        // 遍历哈希表，将单词及其出现次数存储到优先队列中
        for (Map.Entry<String, Integer> word : wordMap.entrySet()) {
            wordQueue.offer(word);
            // 如果优先队列中的单词数量超过10个，则将出现次数最少的单词出队
            if (wordQueue.size() > 10) {
                wordQueue.poll();
            }
        }
    }

    // 打印优先队列中的单词及其出现次数
    public void printQueueCount() {
        // 将优先队列中的单词及其出现次数存储到列表中，便于更改排序
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(wordQueue);
        // 按照出现次数从大到小排序，如果出现次数相同则按照字典序从小到大排序
        entryList.sort((a, b) -> a.getValue().equals(b.getValue()) ? a.getKey().compareTo(b.getKey()) : b.getValue().compareTo(a.getValue()));
        // 使用lambda表达式和foreach遍历列表，打印单词及其出现次数
        entryList.forEach(word -> System.out.println(word.getKey() + ": " + word.getValue()));
    }

}
