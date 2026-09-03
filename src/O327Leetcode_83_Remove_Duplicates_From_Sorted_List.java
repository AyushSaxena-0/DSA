public class O327Leetcode_83_Remove_Duplicates_From_Sorted_List {
    public static void helper(ListNode prev,ListNode curr){
        if(curr==null)return;
        if(prev.val==curr.val){
            prev.next=curr.next;
            helper(prev,curr.next);
            return;
        }
        helper(curr,curr.next);
    }
    public static ListNode deleteDuplicates(ListNode head) {
        if(head==null)return null;
        if(head.next==null)return head;
        helper(head,head.next);
        return head;
    }
    public static void print(ListNode head){
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("End");
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next.next.next = new ListNode(4);
        print(head);
        deleteDuplicates(head);
        print(head);
    }
}
