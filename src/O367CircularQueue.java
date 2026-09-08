public class O367CircularQueue {

    private int[]data;
    private int start=0;
    private int end=0;
    public static int DEFAULT_CAPACITY=10;

    public O367CircularQueue(){
        this.data=new int[DEFAULT_CAPACITY];
    }

    public O367CircularQueue(int size){
        data=new int[size];
    }

    public boolean isEmpty(){
        return start==end;
    }
    public boolean isFull(){
        //Note this condition
        return end==start+1;
    }
    public boolean add(int value)throws Exception{
        if(isFull()){
            throw new Exception("Queue is full");
        }
        data[end++]=value;
        return true;
    }
    public int remove()throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        return data[start++];
    }
    public int peek()throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        return data[start];
    }

}
