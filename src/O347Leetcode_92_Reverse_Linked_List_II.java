public class O347Leetcode_92_Reverse_Linked_List_II {
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
        //Break the rightnode.next otherwise it would be in endless loop
        if(rightNode!=null)rightNode.next=null;
        //Now reverse
        if(beforeToHead!=null)beforeToHead.next=reverse(leftNode);
        if(leftNode!=null)leftNode.next=nextToEnd;
        return head;
    }

    public static void main(String[] args) {
        // Test case:
        // 1 -> 2 -> 3 -> 4 -> 5
        // left = 2, right = 4
        // Expected: 1 -> 4 -> 3 -> 2 -> 5

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode result = reverseBetween(head, 2, 4);

        // Print result
        ListNode temp = result;

        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("End");
    }
}
