public class O327Leetcode_83_Remove_Duplicates_From_Sorted_List {

    public static void main(String[] args) {

        LL list = new LL();

        list.addLast(1);
        list.addLast(2);
        list.addLast(2);
        list.addLast(3);
        list.addLast(3);
        list.addLast(4);
        list.addLast(4);
        list.addLast(4);
        list.addLast(4);

        list.print();

        list.deleteDuplicates();

        list.print();
    }
}