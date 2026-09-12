import java.util.HashSet;

public class O383Leetcode_Count_Values_With_Equally_Spaced_Occurance{
    public static int countSpecialIntegers(int[] nums) {
        int special=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i]))continue;
            int count=0;
            int x1=10;
            int x2=100;
            int x3=5;

            for(int j=i;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    if(count==0){
                        count++;
                        x1=j;
                    }else if(count==1){
                        count++;
                        x2=j;
                    }
                    else{
                        count++;
                        x3=j;
                    }

                }
            }
            if(count==3&&(x2-x1==x3-x2)){
                special++;
            }
            set.add(nums[i]);
        }
        return special;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 8, 1, 5, 1, 5, 8, 5};
        int result = countSpecialIntegers(nums);
        System.out.println(result);  // Expected: 2
    }
}
