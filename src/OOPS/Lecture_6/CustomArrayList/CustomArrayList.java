package OOPS.Lecture_6.CustomArrayList;

public class CustomArrayList {
    //We are going to create an arraylist
    //How does an arrayList works?
    //It creates an array of default size 10
    //When the array is full then it creates another array of twice the size i.e 20 in this case
    //Then all elements of previous arraylist gets copied in it this process is repeated till needed
    //Since the size doubles thus average time complexity comes out top be O(1)
    //We would do add, remove ,size,get, get at index by our custom arraylist
    private int[] data;
    private int size;
    public static int DEFAULT_SIZE=10;

    public CustomArrayList(){
        this.data=new int[DEFAULT_SIZE];
    }
    //add method
    public void add(int value){
        if(size==data.length){
            //Create new array of size 2*DEFAULT_CAPACITY
            int[]arr=new int[DEFAULT_SIZE*2];
            for(int i=0;i<DEFAULT_SIZE;i++){
                arr[i]=data[i];
            }
            data=arr;
            DEFAULT_SIZE=2*DEFAULT_SIZE;
        }
        data[size]=value;
        //Moving ahead
        size++;
    }
    public void printlist(){
        for(int i=0;i<size;i++){
            if(i==0) System.out.print("[");
            if(i==size-1) {
                System.out.print(data[i]+"]");
            return;
            }
            System.out.print(data[i]+",");
        }

    }
    public void removeLast(){
        if(size==0) return;
        size--;
    }
    public void removeIndex(int index){
        if(size==0) return;
        //Remove element at ith index and shift all one by left
        while(index<size){
            data[index]=data[index+1];
            index++;
        }
    }
    public int listSize(){
        return this.size;
    }
    public int get(int index){
        return data[index];
    }
    public static void main(String[] args) {
        CustomArrayList list=new CustomArrayList();
        for(int i=0;i<20;i++){
            list.add(2*i);
        }
        list.removeLast();
        list.removeIndex(2);
        list.printlist();
        System.out.println();
        System.out.println(list.listSize());
        System.out.println(list.get((list.listSize()-1)));
    }
    //Problem with custom arraylist which we made
    //It is only made to handle integer as it has integer arraylist
    //But inBuilt arraylist can handle integer,float or even custom data types
    //So we use generics to solve this problem
    //So check out generic folder
    //Writing code for different arrays would make code lengthy and redundant
    //So we need a template like <Integer> or <String> etc for type Safety
    //<> cannot have <int> or primitives inside them
    //Thus only classes are allowed <Class>
}
