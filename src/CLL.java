public class CLL {

    private Node head;
    private Node tail;
    private int size;

    public CLL() {
        this.size=0;
    }
    public void addFirst(int val){
        if(head==null){
            head=new Node(val);
            tail=head;
            tail.next=head;
            size++;
            return;
        }
        Node newNode=new Node(val);
        newNode.next=head;
        head=newNode;
        tail.next=head;
        size++;
    }
    public void print(){
        if(head==null)return;
        Node temp=head;
        while(temp.next!=head){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println(temp.val+"->HEAD");
    }
    public void addLast(int val){
        if(tail==null){
            addFirst(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        tail.next=head;
        size++;
    }
    public Node getBefore(int index){
        Node temp=head;
        if(head==null||index>=size||index<=0)return null;
        for(int i=1;i<index;i++){
            temp=temp.next;
            if(temp==head)return null;
        }
        return temp;
    }
    public void addAtIndex(int index,int val){
        if(index<0||index>size)return; //Note you can definitely add at index=size by using addLast()
        if(index==0){
            addFirst(val);
            return;
        }//You can add at last index Okay!
        //Don't get confused
        else if(index==size){
            addLast(val);
            return;
        }
        Node node=new Node(val);
        Node before=getBefore(index);
        node.next=before.next;
        before.next=node;
        size++;
    }

    private class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
}
