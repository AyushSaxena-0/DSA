import java.util.ArrayList;

public class O184Recursion_Multiple_Occurances_Return_ArrayList_Function {
    //Returning list but not taking as an argument
    static ArrayList<Integer> findOccurences(int[]arr,int target,int index){
        ArrayList<Integer> ans = new ArrayList<>();
        if(index==arr.length){
            return ans;
        }
        if(arr[index]==target){
            ans.add(index);
        }
        ArrayList<Integer>belowCalls = findOccurences(arr,target,index+1);
        ans.addAll(belowCalls);
        return ans;
    }

    public static void main(String[] args) {
        int[]arr={1,1,1,2,3,4,5,6,7,8,9};
        System.out.println(findOccurences(arr,1,0));
    }
}
