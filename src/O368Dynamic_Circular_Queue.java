public class O368Dynamic_Circular_Queue extends O367CircularQueue{
    //Circular queue has the benefit of reusing the waste storage unlike linear queue
    //However if the circular queue is full then you cannot insert!
    //To fix both above problems we have Dynamic Circular Queue
    //[_,_99,100,101] ----> [99,100,101,0,0,0,0,0,0,0,0]
    //Above represents the benefit of having a dynamic circular queue
    //It uses the empty space and also stores unlimited elements

    @Override
    public boolean add(int value) throws Exception {
        if(isFull()){
            //Double the size and copy elements from start till end of old queue in new array starting from 0
            int[]temp=new int[data.length*2];
            for(int i=0;i<data.length;i++){
                temp[i]=data[(i+start)%data.length];
            }
            start=0;
            end=data.length;
            data=temp;
        }
        return super.add(value);
    }
}
