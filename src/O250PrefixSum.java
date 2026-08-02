import java.util.Arrays;

public class O250PrefixSum {
    //Prefix sum means sum of all the elements before it including itself
    static void main() {
        int[]arr=new int[]{1,3,6,8,9};
        int[]prefixSum=new int[arr.length];

        //Calculating prefix sum prefixSum[i]=prefixSum[i-1]+arr[i];
        //First sum is the element itself
        prefixSum[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefixSum[i]=prefixSum[i-1]+arr[i];
        }
        System.out.println("Prefix sum of the array is: "+ Arrays.toString(prefixSum));

        //Where is it used?
        //To calculate sum of elements in range for example
        //sum(l,r)=prefixSum[r]-prefixSum[l-1]
        //It takes O(1) Time Complexity otherwise it would have taken O(N)
        //Works well when a lot of sum in range is required to protect from doing again and again
        //We use prefix sum
    }
}
