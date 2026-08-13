import java.util.ArrayList;
public class O284Leetcode_1863_Sum_Of_All_Subset_XOR_Totals {
    public static void subset(ArrayList<ArrayList<Integer>>list, ArrayList<Integer>current, int[]nums, int i){
        if(i==nums.length){
            //As otherwise list.add(current) would always point to current thus our logic would break
            list.add(new ArrayList<>(current));
            return;
        }
        //Now either pick or skip
        current.add(nums[i]);
        subset(list, current,nums,i+1);
        //This is backtracking
        current.remove(current.size()-1);
        subset(list,current,nums,i+1);
        //Now i have all the Arrays in the arraylist of subset
    }
    public static int subsetXORSum(int[] nums) {
        //Lets iterate through each subet in the arraylist and then create a sum
        ArrayList<ArrayList<Integer>>list=new ArrayList<>();
        ArrayList<Integer>current=new ArrayList<>();
        int i=0;
        int sum=0;
        //Now i am going to iterate over all array
        subset(list,current,nums,i);
        for(int l=0;l<list.size();l++){
            int xor=0;
            for(int j=0;j<list.get(l).size();j++){
                //Now i am xoring all the things
                xor=xor^list.get(l).get(j);
            }
            sum=sum+xor;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(subsetXORSum(new int[]{1,2,3}));
    }
}
