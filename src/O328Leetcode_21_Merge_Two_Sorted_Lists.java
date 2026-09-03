public class O328Leetcode_21_Merge_Two_Sorted_Lists {

    public static void main(String[] args) {

        LL list1 = new LL();
        list1.addLast(1);
        list1.addLast(1);
        list1.addLast(2);
        list1.addLast(4);

        LL list2 = new LL();
        list2.addLast(2);
        list2.addLast(3);
        list2.addLast(4);
        list2.addLast(5);

        LL list3 = LL.mergeTwoLists(list1, list2);

        list3.print();
    }
}