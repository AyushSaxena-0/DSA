public class O365DynamicStack extends O358CustomStack{
    public O365DynamicStack(){
        super();//It will call O358CustomStack()
    }
    public O365DynamicStack(int size){
        super(size);//It will call O358CustomStack(size)
    }

    @Override
    public boolean push(int val) {
        //array data[] is protected so it can ve accessed in subclasses
        if(isFull()){
            int[]temp=new int[data.length*2];
            //Now copy elements of previous array to this array
            for(int i=0;i<data.length;i++){
                temp[i]=data[i];
            }
            data=temp;
        }
        return super.push(val);
    }
}
