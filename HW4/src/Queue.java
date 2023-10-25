/**
 * 表示一个基于数组（线性表）的队列 (Queue) 数据结构
 */
public class Queue {
    private double[] elements;  // 存储队列中元素的数组
    private int size;           // 队列中元素的数量

    /**
     * 创建一个队列对象，初始容量为 32
     */
    public Queue() {
        elements = new double[32];
        size = 0;
    }

    /**
     * 将指定元素添加到队列的尾部，如果容量已满会将数组容量扩充为原来的两倍
     *
     * @param v 要添加的元素
     */
    public void enqueue(double v) {
        elements[size++] = v;   // 将元素添加到队列尾部
    }

    /**
     * 从队列出队一个元素，并且返回它
     *
     * @return 出队的元素
     */
    public double dequeue() {
        double result = elements[0];    // 先存储队列头部的元素
        double[] temp = new double[elements.length];    // 创建缓存数组，用于存储出队后的元素
        System.arraycopy(elements, 1, temp, 0, size - 1);   // 将出队后的元素复制到缓存数组中
        elements = temp;    // 将缓存数组的引用赋值给 elements
        size--;    // 减少队列中元素的数量
        return result;  // 返回出队的元素
    }

    /**
     * 返回队列头部的元素
     *
     * @return 队列头部的元素
     */
    public double getHead() {
        return elements[0];
    }

    /**
     * 返回队列尾部的元素
     *
     * @return 队列尾部的元素
     */
    public double getTail() {
        return elements[size - 1];
    }

    /**
     * 判断队列是否为空
     *
     * @return 如果队列为空返回 true，否则返回 false
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 判断队列是否已满
     *
     * @return 如果队列已满返回 true，否则返回 false
     */
    public boolean isFull() {
        return size == elements.length;
    }

    /**
     * 返回队列中元素的数量
     *
     * @return 队列中元素的数量
     */
    public int getSize() {
        return size;
    }
}
