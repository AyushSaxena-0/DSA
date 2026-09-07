import java.util.LinkedList;
import java.util.Queue;

public class O361Queue_InBuilt {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        //Queue offers adding on top and removing from bottom
        //Thus it is implemented using linked list
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        queue.offer(6);
        queue.offer(7);
        System.out.println(queue.remove());
    }
}
