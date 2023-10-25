/**
 * 用于测试 Queue 的主类
 */
public class QueueTest {
    public static void main(String[] args) {
        // 创建一个队列并且入队 5 个不同的元素
        Queue q = new Queue();
        q.enqueue(1);
        System.out.println("当前队列大小: " + q.getSize());
        q.enqueue(2);
        System.out.println("当前队列大小: " + q.getSize());
        q.enqueue(3);
        System.out.println("当前队列大小: " + q.getSize());
        q.enqueue(4);
        System.out.println("当前队列大小: " + q.getSize());
        q.enqueue(5);
        System.out.println("当前队列大小: " + q.getSize());

        // 测试一系列操作：入队、出队、取队头元素、取队尾元素、判断队列是否已满、获取队列大小
        System.out.println("当前队列大小: " + q.getSize());
        System.out.println("元素 " + q.dequeue() + "已出栈。");
        System.out.println("当前队列大小: " + q.getSize());
        System.out.println("当前队头元素: " + q.getHead());
        System.out.println("当前队尾元素: " + q.getTail());
        if (q.isEmpty()) {
            System.out.println("队列为空");
        } else {
            System.out.println("队列不为空");
        }
        if (q.isFull()) {
            System.out.println("队列已满");
        } else {
            System.out.println("队列未满");
        }

        // 测试充满队列
        while (!q.isFull()) {
            q.enqueue(0);
        }
        // 测试队列已满的情况
        if (q.isFull()) {
            System.out.println("当前队列已满");
        } else {
            System.out.println("当前队列未满");
        }
        System.out.println("当前队列大小: " + q.getSize());

        // 测试清空队列
        while (!q.isEmpty()) {
            q.dequeue();
        }
        // 测试队列为空的情况
        if (q.isFull()) {
            System.out.println("当前队列已满");
        } else {
            System.out.println("当前队列未满");
        }
        System.out.println("当前队列大小: " + q.getSize());
    }
}
