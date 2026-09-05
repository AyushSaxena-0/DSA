public class O341Bubble_Sort_On_Linked_List {
    public static ListNode getIndex(ListNode head,int index){
        //This function would give the address of the node at index
        int size=getSize(head);
        if(index<0||index>=size)return null;
        if(index==0)return head;
        //Since there is no tail variable in the implementation of leetcode hence tail case is also a general case
        //We need to reach before the index to get its memory address okay!
        ListNode temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        //Now temp has the address of Node which we want
        return temp;
    }
    public static ListNode bubbleSort(ListNode head,int row,int col){
        //Now observe the approach is almost same but since we cannot access any index in linked list so we need a get method
        //That's how you would learn
        //Think like an Engineer
        if(row==0)return head;
        if(col>=row)return bubbleSort(head,row-1,0);
        else if (col<row){
            ListNode first=getIndex(head,col);
            ListNode second=getIndex(head,col+1);
            //Now move the bigger node towards right so that end of each pass largest reaches the end
            if(first.val>second.val){
                first.next=second.next;
                second.next=first;
                if(first==head)head=second;
                else{
                    ListNode prev=getIndex(head,col-1);
                    prev.next=second;
                }
            }
        }
        //Otherwise move forward
        return bubbleSort(head,row,col+1);
    }
    public static int getSize(ListNode head){
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        return size;
    }
    public static ListNode sortList(ListNode head) {
        //I have already solved it by using merge sort but i want to apply bubble sort on the linked list
        //But i need size
        //We now have the size

        if(head==null)return null;
        int size=getSize(head);
        return bubbleSort(head,size-1,0);
    }
    public static void printList(ListNode head){
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("End");
    }
    public static void main(String[] args) {
        ListNode head=new ListNode(5);
        head.next=new ListNode(2);
        head.next.next=new ListNode(4);
        head.next.next.next=new ListNode(3);
        head.next.next.next=new ListNode(1);
        System.out.println("Before sorted");
        printList(head);
        System.out.println("After sorted");
        head=sortList(head);
        printList(head);
    }
}
