import java.math.BigInteger;

public class O402Leetcode_2816_Double_A_Number_Represented_As_Linked_List {
    public static ListNode doubleIt(ListNode head) {
        if(head==null)return head;
        ListNode temp=head;
        StringBuilder sb=new StringBuilder();
        while(temp!=null){
            sb=sb.append(temp.val);
            temp=temp.next;
        }
        String ans = new BigInteger(sb.toString())
                .multiply(BigInteger.valueOf(2))
                .toString();
        //Note this BigInteger thing
        if(ans.length()>sb.toString().length()){
            ListNode node=new ListNode(ans.charAt(0)-'0');
            node.next=head;
            head=node;
        }
        temp=head;
        int i=0;
        while(temp!=null){
            temp.val=ans.charAt(i)-'0';
            temp=temp.next;
            i++;
        }
        return head;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        ListNode result = doubleIt(head);

        ListNode temp = result;

        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
    }
}
