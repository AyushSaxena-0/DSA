public class O171Leetcode_203_Remove_Linked_List_Element {
    public static ListNode removeElements(ListNode head, int val) {
        ListNode curr=head;
        ListNode prev=curr;
        while(curr!=null){
            if(curr.val==val&&curr==head){
                head=head.next;
                curr=head;
            }
            else if(curr.val==val){
                prev.next=curr.next;
                curr=curr.next;
            }
            else{
                prev=curr;
                curr=curr.next;
            }
        }
        return head;
    }
    static void prt(ListNode head){
        while(head!=null){
            System.out.print(head.val+" ");
            head=head.next;
        }
    }

    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        removeElements(head,3);
        prt(head);
    }
}
