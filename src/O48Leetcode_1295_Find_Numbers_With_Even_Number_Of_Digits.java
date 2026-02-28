//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class O48Leetcode_1295_Find_Numbers_With_Even_Number_Of_Digits {
        static int digits(int []nums,int x){
            int i=nums[x];
            if (i<0){
                i=i*-1;
            }
            if (i==0){
                return 1;
            }
            int count=0;
            while(i>0){
                i=i/10;
                count++;
            }
            return count;
        }

        public static int findNumbers(int[] nums) {
            int even=0;
            for(int i =0;i<nums.length;i++){
                int temp=digits(nums,i);
                if(temp%2==0){
                    even++;
                }
            }
            return even;
        }
        //Alternative approach
//    int count=0;
//    for(int i:nums){
//This is mathematical logic to find number of digit by taking integer of log base 10 and adding one to get the digit
//        if(((int) Math.log10(i)+1)%2==0){
//            count++;
//        }
    //}
    //Alternative 2 convert each into string by new string, String s= arr[i]+""
//        public int findNumbers(int[] nums) {
//            int count = 0;
//
//            for (int i = 0; i < nums.length; i++) {
//                String s = nums[i] + "";
//                if (s.length() % 2 == 0) {
//                    count++;
//                }
//            }
//            return count;

    public static void main(String[] args) {
      int[] nums={-123,234,54,5,4545,45,44};
        System.out.println(findNumbers(nums));
        System.out.println(digits(nums,0));
    }
}
