public class LL {
    private Node head;
    private Node tail;
    //Note that you can have a node at index 0 but then its size would be 1
    //So don't get confused between index and size
    //if linked list is empty your size is zero
    //If linked list has a node at index 0 then your size is 1
    //Last index is size-1 in a linked list
    private int size;

    public LL() {
        this.size=0;
    }
    public void addFirst(int val){
        //Draw on paper and then understand
        //Firstly create a node
        //We are maintaining head and tail for our convinience
        Node newNode=new Node(val);
        newNode.next=head;
        head=newNode;
        size++;
        if(tail==null){
            tail=newNode;//When newNode is first Node in entire linked list
        }
    }
    public void print(){
        //You cannot use head for doing the things here
        //As changing the head changes the linked list itself
        //So create a new reference variable temp and move ahead as its scope is limited inside the function
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.print("End");
    }
    public void addLast(int val){
        //if the linked list is empty then tail.next would give null pointer exception
        //So use addfirst function previously created
        //You can write code again here, but I remembered D.R.Y (Do Not Repeat Yourself)
        if(tail==null){
            addFirst(val);
            return;
        }
        Node newNode=new Node(val);
        tail.next=newNode;
        tail=newNode;
        size++;
    }
    public void insertAtIndex(int val,int index){
        if(index<0||index>size)return;
        if(index==0){
            addFirst(val);
            return;
        }
        else if(index==size){
            addLast(val);
            return;
        }
        Node temp=head;
        //For case when we start from i=0 ,Since inside this node temp=temp.next is happening so we need to run this loop index-2 times (To reach at index-1 position)
        //For case when we start from i=1 you can run loop till index-1 (i<index)
        //I find starting from 1 a little more convenient,So I am going start from 1 in linked list Okay !
        for(int i=1;i<index;i++){
            //I am reaching the index before where we need to insert
            temp=temp.next;
        }
        //Creating new Node and Doing Necessary things (By drawing on paper)
        Node newNode=new Node(val);
        newNode.next=temp.next;
        //Alternatively to above two lines since I created a constructor that took Node(int val,Node next)
        //So I could do Node(val,temp.next) then do the following line
        temp.next=newNode;
        size++;
    }
    public int removeFirst(){
        if(head==null)return -1;
        int val=head.val;
        if(head==tail){
            head=null;
            tail=null;
            size--;
            return val;
        }
        head=head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if(tail==null)return -1;
        int val=tail.val;
        if(head==tail){
            head=null;
            tail=null;
            size--;
            return val;
        }
        //Traverse till second last node and update its next value to modify the structure of the linked list
        Node curr=head;
        for(int i=1;i<size-1;i++){
            curr=curr.next;
        }
        tail=curr;
        curr.next=null;
        size--;
        return val;
    }
    public int removeAtIndex(int index){
        if(index<0||index>=size)return -1;
        if(index==0){
            return removeFirst();
        }
        else if(index==size-1){
            return removeLast();
        }
        //Travel till before index and update its next value
        Node curr=head;
        for(int i=1;i<index;i++){
            curr=curr.next;
        }
        int val=curr.next.val;
        curr.next=curr.next.next;
        size--;
        return val;
    }
    public Node get(int index){
        //I am designing this to get the reference pointer to that node
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        return temp;
    }
    public int deleteLast(){
        if(size<=1)return removeFirst();
        //This is alter made by kunal
        Node secondLast=get(size-2);
        int val=secondLast.next.val;
        secondLast.next=null;
        tail=secondLast;
        size--;
        return val;
    }
    public Node find(int value){
        //I am designing this to get the reference pointer to that node
        Node temp=head;
        while(temp!=null){
            if(temp.val==value) {
                return temp;
            }
            temp=temp.next;
        }//Not found
        return null;
    }
    public int deleteAtIndex(int index){
        //This is again alter to removeAtIndex()
        if(index<0||index>=size)return -1;
        else if(index==0)return removeFirst();
        else if(index==size-1)return removeLast();
        //Now for general case get node previous to node which is to be deleted
        Node prev=get(index-1);
        int val=prev.next.val;
        prev.next=prev.next.next;
        size--;
        return val;
    }
    public void insertRec(int index,int val){
        if(index<0||index>size)return;
        if(index==0){
            addFirst(val);
            return;
        }
        if(index==size){
            addLast(val);
            return;
        }
        //helper returns the head
        //Sometimes head may change so we do head=head
        head=helper(index,val,head);
        size++;
    }
    public Node helper(int index,int val,Node node){
        //When index==0 then add new node and do newNode.next=curr.next
        //Then do current.next=newNode but do it by recursion
        //You need to observe how it is done
        if(index==0){
            //Create a newNode
            Node newNode=new Node(val);
            //Add newNode.next=node
            newNode.next=node;//Alter you could have done this by constructor itself as done by kunal
            // Node newNode=new Node(val,node) this already set newNode.next to node
            return newNode;
        }
        node.next=helper(index-1,val,node.next);
        return node;
    }
    //Note I solved this question again because I solved it this time by recursive approach
    public static void helper(Node prev,Node curr){
        if(curr==null)return;
        if(prev.val==curr.val){
            prev.next=curr.next;
            helper(prev,curr.next);
            return;
        }
        helper(curr,curr.next);
    }
    public void deleteDuplicates(){
        if(head==null)return;
        if(head.next==null)return;
        helper(head,head.next);
        //Update size and tail
        size=0;
        tail=null;
        Node temp=head;
        while(temp!=null){
            tail=temp;
            size++;
            temp=temp.next;
        }
    }
    public static LL mergeTwoLists(LL list1,LL list2) {
        //I am going to create a new Linked List
        //and move the pointers and compare them accordingly
        LL list3=new LL();
        Node head1=list1.head;
        Node head2=list2.head;
        while(head1!=null&&head2!=null){
            //This is classic three pointer approach
            //Add whichever value is less and move ahead both the used pointers ahead
            if(head1.val<=head2.val){
                list3.addLast(head1.val);
                head1=head1.next;
            }
            else{
                list3.addLast(head2.val);
                head2=head2.next;
            }
        }
        while(head1!=null){
            list3.addLast(head1.val);
            head1=head1.next;
        }
        while(head2!=null){
            list3.addLast(head2.val);
            head2=head2.next;
        }
        return list3;
    }
    public boolean hasCycle() {
        if (head == null || head.next == null) {
            return false;
        }
        // Classic Floyd Cycle Detection
        Node slow = head;
        Node fast = head;
        /*
         * Once both pointers are inside the cycle,
         * their relative speed is 1 node per iteration.
         * Therefore, fast must eventually catch slow.
         */
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
    private class Node{

        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next=next;
        }
    }
}