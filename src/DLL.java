public class DLL {

    private Node head;
    private Node tail;
    private int size;

    public DLL(){
        this.size=0;
    }

    public void addFirst(int value){
        //Create a new node
        Node newNode=new Node(value);
        newNode.next=head;
        if(head!=null)head.prev=newNode;
        else tail=newNode;
        head=newNode;
        size++;
    }
    public void addLast(int value){
        Node newNode=new Node(value);
        if(tail==null){
            addFirst(value);
            return;
        }
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
        size++;
    }
    public Node getBefore(int index){
        if(index<=0||index>size)return null;
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        return temp;
    }
    public void addAtIndex(int index,int value){
        if(index<0 || index>size)return;
        if(index==0){
            addFirst(value);
            return;
        }
        else if(index==size){
            addLast(value);
            return;
        }
        Node newNode=new Node(value);
        Node prev=getBefore(index);
        newNode.next=prev.next;
        newNode.prev=prev;
        prev.next=newNode;
        newNode.next.prev=newNode;
        size++;
    }
    public int removeFirst(){
        //Draw it on pen and paper and you would be able to figure out what has to be done
        if(head==null)return -1;
        int val=head.val;
        if(head==tail){
            head=null;
            tail=null;
        }
        else {
            head = head.next;
            head.prev = null;
        }
        size--;
        return val;
    }
    public int removeLast(){
        if(tail==null)return -1;
        int val=tail.val;
        if(tail==head)return removeFirst();
        tail=tail.prev;
        tail.next=null;
        size--;
        return val;
    }
    public int removeAtIndex(int index){
        if(index<0 || index>=size)return -1;
        else if(index==0)return removeFirst();
        else if(index==size-1)return removeLast();
            Node prev = getBefore(index);
            int val = prev.next.val;
            prev.next = prev.next.next;
            prev.next.prev = prev;
            size--;
        return val;
    }
    public void print(){
        if(head==null)return;
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("End");
    }

    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int value) {
            this.val = value;
        }
    }
}
