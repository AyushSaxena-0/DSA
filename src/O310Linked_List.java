public class O310Linked_List {
    public static void main(String[] args) {
        LL list=new LL();
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.addFirst(0);
        list.addLast(6);
        list.insertAtIndex(5,5);
        list.removeAtIndex(3);
        list.print();
    }
}
