import java.util.Arrays;

public class O79Leetcode_977_Squares_of_sorted_array {
    //Alter use Brute force arrays.sort is used after squaring each element
    public static int[] sortedSquares(int[] nums) {
        //In this approach we are filling the array from right hand side
        int n = nums.length;
        int[] ans = new int[n];
        //Using two pointers
        int left = 0;
        int right = n - 1;
        //This index is used for actually inserting the element at its sorted location
        int idx = n - 1;

        while (left <= right) {
            int lSq = nums[left] * nums[left];
            int rSq = nums[right] * nums[right];

            if (lSq > rSq) {
                ans[idx--] = lSq;//After accessing this index idx reduces itself by one idx=idx-1;
                left++;//Left pointer is mover futher
                //Note we are entering solution in a diffrent answer array so we don not need to swap
                //We are moving from left to right
            } else {
                ans[idx--] = rSq;// Since the array is sorted, the largest square must come
                // from either leftmost or rightmost element.
                // We place the larger square at the end and move that pointer.
                right--;//right pointer is also moved left
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[]arr={-9,-6,-1,-0,1,2,3,4,5,6,98};
        System.out.println(Arrays.toString(sortedSquares(arr)));
    }
}
