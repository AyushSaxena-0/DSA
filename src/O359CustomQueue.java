public class O359CustomQueue {
    //I here implemented queue using the last pointer only
    //If I would have the first Pointer then the things would be easier to remove just move first++
    //But I am here implementing it with only the end pointer to handle the challenging implementation
    private int[]data;
    private static final int DEFAULT_SIZE=10;
    int end=0;

    public O359CustomQueue(){
        this(DEFAULT_SIZE);
    }

    public O359CustomQueue(int defaultSize) {
        this.data=new int[defaultSize];
    }
    public boolean isEmpty(){
        return end==0;
    }
    public boolean isFull(){
        return end==data.length;
    }

    public boolean insert(int val){//It take O(1) time
        if(isFull()){
            return false;
        }
        data[end++]=val;//Started with zero so end first and then move ahead
        return true;
    }
    public int remove()throws Exception{//removing takes O(N) time
        if(isEmpty()){
            throw new Exception("queue is empty");
        }
        //Shift all elements left by one
        //first element is Automatically deleted
        int element=data[0];
        //Now shift
        for(int i=1;i<end;i++){
            data[i-1]=data[i];
        }
        data[--end]=0;
        return element;
    }
    public int peek()throws Exception{
        if(isEmpty()) {
            throw new Exception("Queue is empty");
        }
        return data[0];
    }
    public void display(){
        for(int i=0;i<end;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
}
