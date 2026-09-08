import java.util.LinkedList;
import java.util.Queue;

public class O361Queue_InBuilt {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        //Queue offers adding on top and removing from bottom
        //Thus it is implemented using linked list
        //Adding in front and back is done in O(1) in linked list by using head and tail
        //Where is stacks and queue used ?
        //It is used in Graph and tree
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
