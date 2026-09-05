public class O343Reverse_Linked_List {
    public static ListNode reverseList(ListNode head) {
        if(head==null||head.next==null)return head;
        //So i would need three pointers okay
        ListNode current=head;
        ListNode prev=null;
        ListNode next=head;
        while(current!=null){
            //Just draw this on pen and paper
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }
    public static void printList(ListNode head){
        ListNode current=head;
        while(current!=null){
            System.out.print(current.val+"->");
            current=current.next;
        }
        System.out.println("END");
    }
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        printList(head);
        head=reverseList(head);
        printList(head);
    }
}
