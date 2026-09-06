public class O343Reverse_Linked_List {
    public static ListNode reverseList(ListNode head) {
        if(head==null||head.next==null)return head;
        //So I would need three pointers okay
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
    public static ListNode reverseList2(ListNode node){
        if(node==null||node.next==null)return node;
        //Beauty of recursion is reaching the tail node by function calls
        //So I reach the end
        //Now you would get out of the tail.next (null)
        //Then come out of tail
        //So I am going to use it to my advantage
        //Store result from previous recursion and use it for your case
        //We needed a tail so we created a node called tail which
        ListNode tail=reverseList2(node.next);//Tail is the new head
        node.next.next=node;
        node.next=null;
        return tail;//It was made because of this
    }
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        printList(head);
        head=reverseList2(head);
        printList(head);
    }
}
