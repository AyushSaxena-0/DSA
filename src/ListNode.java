//Definition for singly-linked list.
public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      //Constructor Overloading
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      public static void printList(ListNode head) {
            while (head != null) {
                  System.out.print(head.val);
                  if (head.next != null) {
                        System.out.print(" -> ");
                  }
                  head = head.next;
            }
            System.out.println();
      }

      public static ListNode createList(int[] arr) {
            ListNode dummy = new ListNode(0);
            ListNode current = dummy;

            for (int value : arr) {
                  current.next = new ListNode(value);
                  current = current.next;
            }

            return dummy.next;
      }
}

