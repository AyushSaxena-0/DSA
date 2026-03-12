public class O121Bitwise_Operators_Find_One_NonDuplicate_Number {
    static int once_Appearance_in_Twice_appearing_number_array(int[] nums) {

        int a = 0;

        for (int i = 0; i < nums.length; i++) {
            a = a ^ nums[i];
        }

        return a;
    }

    public static void main(String[] args) {

        int[] nums = {2, 1, 4, 5, 2, 4, 1};

        int result = once_Appearance_in_Twice_appearing_number_array(nums);

        System.out.println("Non duplicate number: " + result);
    }
}