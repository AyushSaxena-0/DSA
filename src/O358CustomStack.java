public class O358CustomStack {
    //In stacks LIFO or FILO
    //First element to be inserted would be the last element to be out
    //Last element to be inserted would be the first element to be out
    //Pop in stack means removing element on top of stacks
    //Push means inserting elements on top of stack
    //Since the array is protected so I can access it in subclass
    protected int[] data;

    private static final int DEFAULT_SIZE=10;

    int ptr=-1;

    public O358CustomStack() {
        data=new int[DEFAULT_SIZE];
    }

    public O358CustomStack(int size){
        this.data=new int[size];
    }

    public boolean isFull(){
        if(ptr==data.length-1)return true;
        return false;
    }

    public boolean isEmpty(){
        if(ptr==-1)return true;
        return false;
    }

    public boolean push(int val){
        if(isFull())return false;
        ptr++;
        data[ptr]=val;
        return true;
    }

    public int pop() throws O363StackException{
        if(isEmpty()){
            throw new O363StackException("Stack is empty");
        }
        int poppedElement=data[ptr];
        ptr--;
        return poppedElement;//Alter do return data[ptr--]
    }

    public int peak() throws Exception{
        if(isEmpty())return -1;
        return data[ptr];
    }

}

