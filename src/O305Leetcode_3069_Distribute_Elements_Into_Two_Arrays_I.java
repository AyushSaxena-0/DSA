import java.util.*;
public class O305Leetcode_3069_Distribute_Elements_Into_Two_Arrays_I {
    public static int[] resultArray(int[] nums) {
        //I am creating two arraylists
        List<Integer>list1=new ArrayList<>();
        List<Integer>list2=new ArrayList<>();
        int[]ans=new int[nums.length];
        int index=0;
        //According to the question
        list1.add(nums[0]);
        list2.add(nums[1]);

        for(int i=2;i<nums.length;i++){
            if(list1.get(list1.size()-1)>list2.get(list2.size()-1)){
                list1.add(nums[i]);
            }
            else{
                list2.add(nums[i]);
            }
        }
        list1.addAll(list2);
        for(int x:list1){
            ans[index++]=x;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[]nums={5,4,3,8};
        System.out.println(Arrays.toString(resultArray(nums)));
    }
}
