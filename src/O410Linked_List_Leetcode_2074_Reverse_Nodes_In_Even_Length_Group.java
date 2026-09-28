public class O410Linked_List_Leetcode_2074_Reverse_Nodes_In_Even_Length_Group {
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
        //Find node before left travese till it
        ListNode beforeToHead = head;
        //Traverse to find node before the left
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
    public static ListNode reverseEvenLengthGroups(ListNode head) {

        int start = 1;
        int size = getSize(head);
        int k = 1;

        while (start <= size) {
            int end = start + k - 1;
            // Final group may be smaller than k
            if (end > size) {
                end = size;
            }
            int groupLength = end - start + 1;
            // Reverse only even-length groups
            if (groupLength % 2 == 0) {
                head = reverseBetween(head, start, end);
            }
            k++;
            start = end + 1;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next.next.next = new ListNode(8);
        head.next.next.next.next.next.next.next.next = new ListNode(9);
        head.next.next.next.next.next.next.next.next.next = new ListNode(10);
        head.next.next.next.next.next.next.next.next.next.next = new ListNode(11);
        head.next.next.next.next.next.next.next.next.next.next.next = new ListNode(12);
        head=reverseEvenLengthGroups(head);
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("End");
    }
}
