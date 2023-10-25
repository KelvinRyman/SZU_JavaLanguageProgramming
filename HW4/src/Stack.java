/**
 * 表示一个基于数组（线性表）的栈 (Stack) 数据结构
 */
public class Stack {
    private final double[] elements;  // 存储栈中元素的数组
    private int size;           // 栈中元素的个数

    /**
     * 创建一个空栈，初始容量为 32
     */
    public Stack() {
        elements = new double[32];
        size = 0;
    }

    /**
     * 将指定元素推入栈顶，如果栈满，则扩充栈的容量为原来的两倍
     *
     * @param v 要推入栈顶的元素
     */
    public void push(double v) {
        elements[size++] = v;   // 将元素添加到栈顶
    }

    /**
     * 将栈顶元素弹出栈
     *
     * @return 从栈顶弹出的元素
     */
    public double pop() {
        double result = elements[size - 1]; // 先存储栈顶元素
        size--; // 减少栈中元素的个数
        return result;  // 返回栈顶元素
    }

    /**
     * 返回栈顶元素，但不弹出栈顶元素
     *
     * @return 栈顶元素
     */
    public double top() {
        return elements[size - 1];
    }

    /**
     * 判断栈是否为空
     *
     * @return 如果栈为空，则返回 true，否则返回 false
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 判断栈是否已满
     *
     * @return 如果栈已满，则返回 true，否则返回 false
     */
    public boolean isFull() {
        return size == elements.length;
    }

    /**
     * 返回栈中元素的个数
     *
     * @return 栈中元素的个数
     */
    public int getSize() {
        return size;
    }
}
