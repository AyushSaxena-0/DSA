import java.util.Arrays;

public class O251SuffixSum {
    static void main() {
        int[]nums={1,2,3,4,5};
        int n=nums.length;
        int[]suffixSum=new int[n];
        //Because last element suffix sum is the element itself
        suffixSum[n-1]=nums[n-1];
        //Now calculating suffix sum
        //suffixSum[i]=nums[i]+suffixSum[i+1];
        for(int i=n-2;i>=0;i--){
            suffixSum[i]=suffixSum[i+1]+nums[i];
        }
        System.out.println(Arrays.toString(suffixSum));
        //Used to find sum from an index to end of array
        //Much more helpful
        //Takes O(1) Time complexity as looping for everyone would result in higher time complexity
    }
}
