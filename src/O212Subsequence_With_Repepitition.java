import java.util.ArrayList;
import java.util.Arrays;

public class O212Subsequence_With_Repepitition {
    //When you find a duplicate element add it in newly created subset of previous steps
    //Because of above points duplicate have to be together
    //So sort the array
    public static ArrayList<ArrayList<Integer>>subRep(int[]arr){
        //Sorting the array first to detect duplication
        Arrays.sort(arr);
        //Creating the required list
        ArrayList<ArrayList<Integer>>outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        //create two variables start and end to keep index of last
        int start=0;
        int end=0;
        //Now iterating over the array
        for(int i=0;i<arr.length;i++){
            start=0;
            if(i>0&& arr[i]==arr[i-1]){
                //Because end marks the last index before current iteration
                //New subsets formed in previous iteration = (end_previous + 1 ... new_end)
                //So for duplicates, you only extend those
                start=end+1;
            }
            // 'end' retains its value from the previous iteration,
            // so it marks the last index of subsets before the current expansion
             end=outer.size()-1;
            for(int j=start;j<=end;j++){
                ArrayList<Integer>temp=new ArrayList<>(outer.get(j));
                temp.add(arr[i]);
                outer.add(temp);
            }
        }
        return outer;
    }

    public static void main(String[] args) {
        System.out.println(subRep(new int[]{1,2,2}));
    }
}
