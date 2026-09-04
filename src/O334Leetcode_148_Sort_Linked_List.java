public class O334Leetcode_148_Sort_Linked_List {
    public static ListNode merge(ListNode head1,ListNode head2){
        //Create a new linked list3
        //Note how i used merged sort here to sort the linked list
        //but since i don't have the starting and ending index so i need to make the end of each list to be null
        ListNode head3=new ListNode(0);
        ListNode dummy=head3;
        while(head1!=null&&head2!=null){
            //Whichever is less add it into linked list and move ahead both the pointers
            if(head1.val<head2.val){
                ListNode node=new ListNode(head1.val);
                dummy.next=node;
                dummy=node;
                head1=head1.next;
            }
            else{
                //head1.val>=head2.val
                ListNode node=new ListNode(head2.val);
                dummy.next=node;
                dummy=node;
                head2=head2.next;
            }
        }
        //Whichever is remaining add
        while(head1!=null){
            ListNode node=new ListNode(head1.val);
            dummy.next=node;
            dummy=node;
            head1=head1.next;
        }
        while(head2!=null){
            ListNode node=new ListNode(head2.val);
            dummy.next=node;
            dummy=node;
            head2=head2.next;
        }//Next because first element is zero due to our cunstructor
        return head3.next;
    }
    public static ListNode findMid(ListNode head){
        //Slow and fast pointer approach
        //To find the mid element
        if(head==null)return null;
        if(head.next==null)return head;
        ListNode slow =head;
        ListNode fast=head;
        ListNode prev = null;//Break the lists into two parts its not array you don't have the starting and ending index
        while(fast!=null&&fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=null;//This is done to break a list into two linekd list otherwise you won't stop in list
        return slow;
    }
    public static ListNode sortList(ListNode head) {
        //We are sorting this by merge sort
        //Don't worry just break the list till we have two nodes as head
        //merge them
        //return head
        //Don't forget to add the base case to the recursion of sortlist function
        if(head==null || head.next==null){
            return head;
        }
        ListNode mid=findMid(head);
        //Divide into two parts where head is head and where head is mid
        ListNode left=sortList(head);
        ListNode right=sortList(mid);
        return merge(left,right);
    }

    public static void main(String[] args) {
        ListNode head=new ListNode(6);
        head.next=new ListNode(5);
        head.next.next=new ListNode(4);
        head.next.next.next=new ListNode(3);
        head.next.next.next=new ListNode(2);
        head.next.next.next.next=new ListNode(1);
        ListNode temp=sortList(head);
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
}
