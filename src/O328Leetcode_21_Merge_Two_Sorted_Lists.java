public class O328Leetcode_21_Merge_Two_Sorted_Lists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //I am going to create a new Linked List
        //and move the pointers and compare them accordingly
        ListNode list3=new ListNode();
        ListNode head3=list3;
        ListNode head1=list1;
        ListNode head2=list2;
        while(head1!=null&&head2!=null){
            //This is classic three pointer approach
            //Add whichever value is less and move ahead both the used pointers ahead
            if(head1.val<=head2.val){
                ListNode node=new ListNode(head1.val);
                head3.next=node;
                head1=head1.next;
                head3=head3.next;
            }
            else{
                ListNode node=new ListNode(head2.val);
                head3.next=node;
                head2=head2.next;
                head3=head3.next;
            }
        }
        while(head1!=null){
            ListNode node=new ListNode(head1.val);
            head3.next=node;
            head1=head1.next;
            head3=head3.next;
        }
        while(head2!=null){
            ListNode node=new ListNode(head2.val);
            head3.next=node;
            head2=head2.next;
            head3=head3.next;
        }
        //i returned list.next as i created a node default first for initiation of linked list having value 0
        return list3.next;
    }
    public static void print(ListNode head){
        ListNode curr=head;
        while(curr!=null){
            System.out.print(curr.val+"->");
            curr=curr.next;
        }
        System.out.println("End");
    }
    public static void main(String[] args) {
        ListNode list1=new ListNode(1);
        list1.next=new ListNode(1);
        list1.next.next=new ListNode(2);
        list1.next.next.next=new ListNode(4);
        ListNode list2=new ListNode(2);
        list2.next=new ListNode(3);
        list2.next.next=new ListNode(4);
        list2.next.next.next=new ListNode(5);
        ListNode list3=new ListNode(6);
        ListNode head3=mergeTwoLists(list1,list2);
        print(head3);
    }
}
