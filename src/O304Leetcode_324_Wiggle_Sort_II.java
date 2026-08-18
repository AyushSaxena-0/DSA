import java.util.Arrays;

public class O304Leetcode_324_Wiggle_Sort_II {
    public static void wiggleSort(int[] nums) {
        //This problem is trick problem you need to sort it
        Arrays.sort(nums);
        int n=nums.length;
        int x=0;
        int[]ans=new int[n];
        int mid=(n+1)/2;
        int left=mid-1;
        int right=n-1;
        //[1,1,1,4,5,6]
        //      ^     ^
        //      |     |
        //    left    end
        for(int i=0;i<n;i++){
            if(i%2==0){
                ans[x++]=nums[left--];
            }
            else{
                ans[x++]=nums[right--];
            }
        }
        //Note this copying methord
        //You can also use int[]copy =Arrays.copyOf(arr,arr.length)
        System.arraycopy(ans,0,nums,0,n);
    }

    public static void main(String[] args) {
        int[]nums={1,5,1,1,6,4};
        wiggleSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
