import java.util.Arrays;

public class O373Leetcode_167_Two_Sum_II_Input_Array_Is_Sorted {
    public static int[] twoSum(int[] numbers, int target) {
        int n=numbers.length-1;
        int i=0;
        int j=n;
        //Since the array is sorted
        //moving the left pointer only when sum is less and right only when sum is greater
        //First sum would be the smallest possible sum as the array is given to be sorted
        while(i<=n&&j>=0){
            int sum=numbers[i]+numbers[j];
            if(sum==target){
                //Array is one indexed in question situation
                return new int[]{i+1,j+1};
            }
            else if(sum>target){
                j--;
            }
            else i++;
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[]numbers={1,2,3,4,5,6,7,8,9};
        int target=9;
        System.out.println(Arrays.toString(twoSum(numbers,target)));
    }
}
