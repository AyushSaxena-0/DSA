public class O338Leetcode_1290_Convert_Binary_Number_Into_A_Linked_List_To_Integer {
    public static int stringToInt(String s){
        int index=s.length()-1;
        int ans=0;
        int power=0;
        while(index>-1){
            char ch=s.charAt(index);
            if(ch=='0'){
                power++;
                index--;
            }
            else{
                ans=ans+(int)Math.pow(2,power);
                power++;
                index--;
            }
        }
        return ans;
    }
    public static int getDecimalValue(ListNode head) {
        StringBuilder sb=new StringBuilder();
        ListNode temp=head;
        while(temp!=null){
            sb.append(temp.val);
            temp=temp.next;
        }
        String ans=sb.toString();
        int x=stringToInt(ans);
        return x;
    }
    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(0);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(0);

        int result = getDecimalValue(head);

        System.out.println(result);
    }
}
