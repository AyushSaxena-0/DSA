public class O346Leetcode_4044_Count_Good_Cyclic_Rotations {
    public static int countGoodRotations(int[] nums) {
        long first=0;
        long last=0;
        int n=nums.length;
        int count=0;

        for(int i=0;i<n/2;i++){
            first=first+nums[i];
        }
        for(int i=n/2;i<n;i++){
            last=last+nums[i];
        }
        for(int i=0;i<n;i++){
            if(first>last)count++;
            first=first-nums[i]+nums[(i+n/2)%n];
            last=last-nums[(i+n/2)%n]+nums[i];
        }
        return count;
    }

    public static void main(String[] args) {
        int[]arr={1,2,3,4};
        System.out.println(countGoodRotations(arr));
    }
}
