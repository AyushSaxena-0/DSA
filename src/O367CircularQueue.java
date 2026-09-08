public class O367CircularQueue {

    protected int[]data;
    protected int start=0;
    protected int end=0;
    protected int size=0;
    public static int DEFAULT_CAPACITY=10;

    public O367CircularQueue(){
        this.data=new int[DEFAULT_CAPACITY];
    }

    public O367CircularQueue(int size){
        data=new int[size];
    }

    public boolean isEmpty(){
        return size==0;
    }
    public boolean isFull(){
        //Note this condition
        return size==data.length;
    }
    public boolean add(int value)throws Exception{
        if(isFull()){
            throw new Exception("Queue is full");
        }
        data[end++]=value;
        end=end%data.length;
        size++;
        return true;
    }
    public int remove()throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        int removed=data[start++];
        start=start%data.length;
        size--;
        return removed;
    }
    public int peek()throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        return data[start];
    }
    public void display() {
        if(isEmpty()){
            System.out.println("Empty");
        }
        int i = start;
        do {
            System.out.println(data[i]);
            i++;
            i=i%data.length;
        } while (i < end);

    }
}

