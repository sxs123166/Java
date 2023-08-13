package Collection.List;

import java.util.LinkedList;
import java.util.List;

public class linkedListTest {
    public static void main(String[] args) {
        // 1.创建一个队列
        LinkedList<String> queue = new LinkedList<>();
        // 入队
        queue.addLast("1号");
        queue.addLast("2号");
        queue.addLast("3号");
        queue.addLast("4号");
        System.out.println(queue);

        // 出队
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue);

        // 2.创建栈对象
        LinkedList<String> stack = new LinkedList<>();
        // 压栈 push
        stack.addFirst("1号");
        stack.addFirst("2号");
        stack.addFirst("3号");
        stack.push("4号");
        // 出栈 pop
        System.out.println(stack.removeFirst());
        System.out.println(stack.removeFirst());
        System.out.println(stack.pop());
        System.out.println(stack);



    }
}
