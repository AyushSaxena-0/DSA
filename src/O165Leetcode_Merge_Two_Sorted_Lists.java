public class O165Leetcode_Merge_Two_Sorted_Lists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1==null)return list2;
        else if(list2==null)return list1;
        ListNode dummy;
        if(list1.val<list2.val){
            dummy=new ListNode(list1.val);
            list1=list1.next;
        }
        else{
            dummy=new ListNode(list2.val);
            list2=list2.next;
        }
        ListNode curr=dummy;

        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                curr.next=new ListNode(list1.val);
                list1=list1.next;
                curr=curr.next;
            }
            else{
                curr.next=new ListNode(list2.val);
                list2=list2.next;
                curr=curr.next;
            }
        }
        while(list1!=null){
            curr.next=new ListNode(list1.val);
            list1=list1.next;
            curr=curr.next;
        }
        while(list2!=null){
            curr.next=new ListNode(list2.val);
            list2=list2.next;
            curr=curr.next;
        }
        return dummy;
    }
    public static void printlink(ListNode head){
        while(head!=null){
            System.out.print(head.val+" ");
            head=head.next;
        }
    }

    public static void main(String[] args) {
        ListNode list1=new ListNode(1);
        ListNode list2=new ListNode(2);
        ListNode ans=mergeTwoLists(list1,list2);
        printlink(ans);
    }
}
