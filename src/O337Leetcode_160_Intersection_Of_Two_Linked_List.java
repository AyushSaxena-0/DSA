import java.util.HashSet;

public class O337Leetcode_160_Intersection_Of_Two_Linked_List {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //I think i am going to solve this by using hashset
        HashSet<ListNode> set=new HashSet<>();
        ListNode temp1=headA;
        ListNode temp2=headB;
        while(temp1!=null){
            set.add(temp1);
            temp1=temp1.next;
        }
        while(temp2!=null){
            if(set.contains(temp2))return temp2;
            //Its optional to add or not you can get to answer without adding elements of second list
            //set.add(temp1); (Just move ahead as intersection would be found)
            set.add(temp1);
            temp2=temp2.next;
        }
        return null;
    }

    public static void main(String[] args) {
        // Common part
        ListNode common = new ListNode(8);
        common.next = new ListNode(10);

        // List A: 3 -> 7 -> 8 -> 10
        ListNode headA = new ListNode(3);
        headA.next = new ListNode(7);
        headA.next.next = common;

        // List B: 99 -> 8 -> 10
        ListNode headB = new ListNode(99);
        headB.next = common;

        ListNode result = getIntersectionNode(headA, headB);

        System.out.println(result.val);  // 8
    }
}
