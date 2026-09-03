public class O325Linked_List_Leetcode_Approach {
    //You have two ways to solve leetcode problems
    //1)Void return type and make changes to the linked list
    //2)Node return type that return the list Node to change the structure
    public static void main(String[] args) {
        LL list=new LL();
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.addFirst(0);
        list.insertRec(6,6);
        list.print();
    }
}
