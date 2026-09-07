public class O356Leetcode_25_Reverse_Nodes_In_K_Group {
    //Modify for alternate k Group skip the next k nodes by using a for loop
    public static ListNode reverse(ListNode head){
        if(head==null||head.next==null)return head;
        ListNode current=head;
        ListNode next=head.next;
        ListNode prev=null;
        while(current!=null){
            current.next=prev;
            prev=current;
            current=next;
            if(next!=null)next=next.next;
        }
        return prev;
    }
    public static ListNode get(ListNode head,int index){
        //I want to get the node which has its value as val
        ListNode temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        return temp;
    }
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        //If Linked list is empty or has only one element return that node
        if(head==null||head.next==null)return head;

        ListNode leftNode=get(head,left);
        ListNode rightNode=get(head,right);
        ListNode nextToEnd=(rightNode==null)?null:rightNode.next;
        //Break the list
        //So that you can reverse the list
        rightNode.next = null;

        if(left == 1){
            head = reverse(leftNode);
            leftNode.next = nextToEnd;
            return head;
        }
        // Find node before left
        ListNode beforeToHead = head;

        while((beforeToHead!=null)&&beforeToHead.next!=leftNode){
            beforeToHead=beforeToHead.next;
        }
        //Now reverse
        if(beforeToHead!=null)beforeToHead.next=reverse(leftNode);
        if(leftNode!=null)leftNode.next=nextToEnd;
        return head;
    }
    public static int getSize(ListNode head){
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        return size;
    }
    public static ListNode reverseKGroup(ListNode head, int k) {
        int start=1;
        int size=getSize(head);
        while(true){
            int end=start+k-1;
            if(end>size)return head;
            head=reverseBetween(head,start,end);
            start=end+1;
        }
    }
    public static void printList(ListNode head){
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("End");
    }
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        head.next.next.next.next.next=new ListNode(6);
        head.next.next.next.next.next.next=new ListNode(7);
        head.next.next.next.next.next.next.next=new ListNode(8);
        head.next.next.next.next.next.next.next.next=new ListNode(9);
        head.next.next.next.next.next.next.next.next.next=new ListNode(10);
        head.next.next.next.next.next.next.next.next.next.next=new ListNode(11);
        printList(head);
        head=reverseKGroup(head,3);
        printList(head);
    }
}
