public class O357Leetcode_61_Rotate_List {
    public static int sizeL(ListNode head){
        ListNode temp=head;
        int l=0;
        while(temp!=null){
            l++;
            temp=temp.next;
        }
        return l;
    }
    public static ListNode rotateRight(ListNode head, int k) {
        //Alternate is reach size-k-1 and then put heat entire part in front and update the new had and make the next of size-k-1 th node as null
        if(head==null||head.next==null)return head;
        int size=sizeL(head);
        k=k%size;//If length is 6 rotating it 6 times would give same list
        int times=0;
        while(times<k){

            ListNode temp=head;
            //Move before last node
            while(temp.next.next!=null){
                temp=temp.next;
            }
            //Now we got previous to last node in temp
            ListNode last=temp.next;
            last.next=head;
            temp.next=null;
            head=last;
            times++;
        }
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
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        head.next.next.next.next.next=new ListNode(6);
        head.next.next.next.next.next.next=new ListNode(7);
        head.next.next.next.next.next.next.next=new ListNode(8);
        head=rotateRight(head,3);
        print(head);
    }
}
