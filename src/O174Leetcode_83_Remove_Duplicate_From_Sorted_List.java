public class O174Leetcode_83_Remove_Duplicate_From_Sorted_List {
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode curr=head;
        while(curr!=null&&curr.next!=null){
            if(curr.val==curr.next.val){
                curr.next=curr.next.next;
            }
            else{curr=curr.next;}
        }
        return head;
    }
public static void prt(ListNode head){
    while(head!=null){
        System.out.print(head.val+" ");
        head=head.next;
    }
}
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next.next.next = new ListNode(8);
        deleteDuplicates(head);
        prt(head);

    }
}
