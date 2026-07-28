public class O236Leetcode_19_Remove_Nth_Node_from_the_end_of_LinkedList {
    public static int totalNodes(ListNode head){
        //This function counts the total nodes
        int count=0;
        ListNode last=head;
        while(last!=null){
            last=last.next;
            count++;
        }
        return count;
    }
    public static ListNode removeTargetNode(ListNode head,int target){
        ListNode temp=head;
        //Getting to the node before (target has already been substracted by one in main function)
        while(target!=0&&temp!=null){
            temp=temp.next;
            target--;
        }
        //Now updating the value to remove the value in between
        temp.next=temp.next.next;
        return head;
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        //Note mth node from end is (k-m+1)st node from beginning if total nodes are k
        int total = totalNodes(head);
        if (n == total) {
            return head.next;
        }
        //Find the node before of the node which has to be deleted
        int target=total-n-1;
        return removeTargetNode(head,target);
    }
    public static void printLinkedList(ListNode head){
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.val+"--> ");
            temp=temp.next;
        }
    }
    static void main() {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        removeNthFromEnd(head,2);
        printLinkedList(head);

    }
}
