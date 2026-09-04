public class O336Leetcode_234_Palindromic_Linked_List {
    public static ListNode getMid(ListNode head){
        ListNode prev=head;
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null&&fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        //Broke the linked list
        // Odd length: skip the middle node
        //Fast won't be null when the length is odd as fast=fast.next.next
        if (fast != null) {
            slow = slow.next;
        }
        prev.next=null;
        return slow;
    }
    public static String strValue(ListNode head){
        ListNode temp=head;
        StringBuilder sb=new StringBuilder();
        while(temp!=null){
            sb.append(temp.val);
            temp=temp.next;
        }
        return sb.toString();
    }
    public static boolean isPalindrome(ListNode head) {
        //Break list into two parts
        if(head==null||head.next==null)return true;
        ListNode left=head;
        ListNode right=getMid(head);
        String leftlist=strValue(left);
        String rightlist=strValue(right);
        rightlist=new StringBuilder(rightlist).reverse().toString();
        if(leftlist.equals(rightlist))return true;
        return false;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);

        Solution sol = new Solution();

        System.out.println(isPalindrome(head));
    }
}
