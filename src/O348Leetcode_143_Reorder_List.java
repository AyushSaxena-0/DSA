public class O348Leetcode_143_Reorder_List {
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
    public static ListNode mid(ListNode head){
        if(head==null||head.next==null)return head;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static void reorderList(ListNode head) {
        if(head==null||head.next==null)return ;
        //Okay so reach the mid of linked list
        //Break the list into two parts
        //Take two pointers then do what is required
        ListNode mid=mid(head);
        ListNode second=mid.next;
        //Break the list
        mid.next=null;
        //reverse the second linked list
        second=reverse(second);
        //Now taking two pointers
        ListNode first=head;
        ListNode third=new ListNode(0);
        while(first!=null&&second!=null){
            third.next=first;
            first=first.next;
            third.next.next=second;
            second=second.next;
            third=third.next.next;
        }
        while(first!=null){
            third.next=first;
            first=first.next;
            third=third.next;
        }
        while(second!=null){
            third.next=second;
            second=second.next;
            third=third.next;
        }
        return;
    }

    public static void main(String[] args) {

    }
}
