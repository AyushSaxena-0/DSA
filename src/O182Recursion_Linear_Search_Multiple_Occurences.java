import java.util.ArrayList;

public class O182Recursion_Linear_Search_Multiple_Occurences {
    static ArrayList<Integer>linearSearch(int[]arr,int index,int target,ArrayList<Integer> list){
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return linearSearch(arr,index+1,target,list);
    }

    public static void main(String[] args) {
        int[]arr={1,2,3,3,3,3,4,5,6};
        ArrayList<Integer>list=new ArrayList<>();
        System.out.println(linearSearch(arr,0,3,list));
    }
}
