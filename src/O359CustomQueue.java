public class O359CustomQueue {
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

    public boolean insert(int val){
        if(isFull()){
            return false;
        }
        data[end++]=val;//Started with zero so end first and then move ahead
        return true;
    }
}
