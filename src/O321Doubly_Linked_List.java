public class O321Doubly_Linked_List {
    public static void main(String[] args) {
        DLL list=new DLL();
        list.addFirst(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addAtIndex(3,100);
        list.print();
        list.removeFirst();
        list.print();
        list.removeLast();
        list.print();
        list.printReverse();
    }
}
