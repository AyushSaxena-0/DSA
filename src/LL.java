public class LL {
    private Node head;
    private Node tail;

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
        temp.next=newNode;
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
