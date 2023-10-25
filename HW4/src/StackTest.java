/**
 * 表示一个基于数组的栈（Stack）数据结构
 */
public class StackTest {
    public static void main(String[] args) {
        // 创建一个栈并且入栈 5 个不同的元素
        Stack st = new Stack();
        st.push(1);
        System.out.println("当前栈大小: " + st.getSize());
        st.push(2);
        System.out.println("当前栈大小: " + st.getSize());
        st.push(3);
        System.out.println("当前栈大小: " + st.getSize());
        st.push(4);
        System.out.println("当前栈大小: " + st.getSize());
        st.push(5);
        System.out.println("当前栈大小: " + st.getSize());
        System.out.println();

        // 测试一系列操作：入栈、出栈、取栈顶元素、判断栈是否为空、判断栈是否已满、获取栈的大小
        System.out.println("当前栈大小: " + st.getSize());
        System.out.println("元素 " + st.pop() + " 已出栈。");
        System.out.println("此时栈顶元素: " + st.top());
        if (st.isEmpty()) {
            System.out.println("栈为空");
        } else {
            System.out.println("栈不为空");
        }
        if (st.isFull()) {
            System.out.println("栈已满");
        } else {
            System.out.println("栈未满");
        }

        // 测试充满栈的容量
        while (!st.isFull()) {
            st.push(0);
        }
        // 测试栈已满的情况
        if (st.isFull()) {
            System.out.println("当前栈已满");
        } else {
            System.out.println("当前栈未满");
        }
        System.out.println("当前栈大小: " + st.getSize());

        // 测试清空栈
        while (!st.isEmpty()) {
            st.pop();
        }
        // 测试栈为空的情况
        if (st.isFull()) {
            System.out.println("当前栈已满");
        } else {
            System.out.println("当前栈未满");
        }
        System.out.println("当前栈大小: " + st.getSize());
    }
}
