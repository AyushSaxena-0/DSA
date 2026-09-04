public class O335Leetcode_237_Delete_Node_In_A_Linked_List {
    public static void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
        return;
    }

    public static void main(String[] args) {
        // 4 -> 5 -> 1 -> 9
        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(9);
        // Node to delete = 5
        ListNode node = head.next;
        deleteNode(node);
        // Print result
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("End");
    }
}
