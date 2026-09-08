import java.util.ArrayDeque;
import java.util.Deque;

public class O362Deque_In_Built {
    //In deque you can add and remove elements from both the sides
    //It is faster than linked list used in stacks and queue
    public static void main(String[] args) {
        Deque<Integer> deque=new ArrayDeque<>();
        deque.addLast(1);
        deque.addLast(2);
        deque.addLast(3);
        deque.addLast(4);
        deque.addLast(5);
        deque.addFirst(100);
        deque.removeFirst();
        deque.removeLast();
        deque.addLast(999);
        System.out.println(deque);
    }
}
