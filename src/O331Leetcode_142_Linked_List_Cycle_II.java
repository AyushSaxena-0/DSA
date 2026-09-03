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
