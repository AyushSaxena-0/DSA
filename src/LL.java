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
