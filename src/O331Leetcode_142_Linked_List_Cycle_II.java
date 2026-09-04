import java.util.ArrayList;
import java.util.List;

public class O331Leetcode_142_Linked_List_Cycle_II {
    public static ListNode detectCycle(ListNode head) {

        ListNode slow=head;
        ListNode fast=head;
        ListNode third=head;

        List<ListNode> list=new ArrayList<>();
        if(head==null)return null;
        //Detect cycle
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                //That means cycle is there
                //I am now creating an arraylist of all Nodes in cycle
                do{
                    list.add(slow);
                    slow=slow.next;
                }while(slow!=fast);
                //Now move third pointer and check which node comes in arraylist first
                while(third!=null){
                    if(list.contains(third))return third;
                    third=third.next;
                }

            }
        }
        return null;
    }
    //Alternative approach is firstly find length of the cycle
    //Move the first pointer length of cycle times
    //Then start moving both the pointer together {Note since second pointer is stuck in look then even moving it length of cycle would bring it back to same position however the first pointer starting from head would reach l steps}
    //Now increment both cycle in loop till they become equal
    //Resultant node is answer
    //Above-mentioned is Kunal's approach it is similar how arr[(i+n)%n] =arr[i]
    //After slow and fast meet, the distance from the meeting point back to the cycle start is equal to the distance from head to the cycle start (modulo the cycle length). Therefore, resetting one pointer to head and moving both one step at a time makes them meet at the cycle start.    //Learn the relation
    //from head till point where slow and fast pointer meet consider saying it point I (Intersection point)
    //Now take pointer three from start
    //Move the pointer three equal to length of cycle times
    //Now observe remaining distance in cycle till start node is (l-(l-k))
    //Now see distance from head to first node of loop is equal to k
    //And distance from meeting point of third and (slow and fast pointer meeting point) are both equal to k
    //Thus move both third and slow (or fast pointer but move only once in either cases) pointer once and the point where third and the slow(or fast) meet becomes the first node of loop


    public static void main(String[] args) {
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(0);
        ListNode n4 = new ListNode(-4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n2;

        ListNode result = detectCycle(n1);

        if(result != null)
            System.out.println("Cycle starts at: " + result.val);
        else
            System.out.println("No cycle");
    }
}
