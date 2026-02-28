public class O78Leetcode_3232_Find_If_Digit_Game_Can_Be_Won {
    public static int singledigit(int[] nums){
            int sum=0;
            for(int num:nums){
                if(num/10==0){
                    sum+=num;
                }
            }
            return sum;
        }

        public static int doubledigit(int[] nums){
            int sum=0;
            for(int num:nums){
                if(num/10>0){
                    sum+=num;
                }
            }
            return sum;
        }
        //Alter do everything in one function
        //Save sumsingle and sumdouble in one loop and use them to give answer
        //return if both are equal or not
        public static boolean canAliceWin(int[] nums) {
            int s=singledigit(nums);
            int d=doubledigit(nums);
            if(s==d)return false;
            return true;
        }

        public static void main(String[] args) {
            int[]nums={1,22,34,9,9,9,9,9,9,9,9,9,9,9};
            System.out.println(canAliceWin(nums));
        }
}
