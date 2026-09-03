public class O329Leetcode_141_Linked_List_Cycle_Detection {
    //Implementation in LL class
    //Also i have already done this previously but want to do it as done by Kunal in LL class
    public static void main(String[] args) {
        LL list = new LL();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);

        System.out.println(list.hasCycle());
    }
}
