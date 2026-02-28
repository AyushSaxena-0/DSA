public class O82Leetcode_3024_Type_of_triangles {
    public static String triangleType(int[] nums) {
        //Sum of any two sides of triangle should be less than or equal to the third side
        if((nums[0]+nums[1]<=nums[2] || nums[1]+nums[2]<=nums[0]) || (nums[0]+nums[2]<=nums[1]))return "none";
        //All three sides equal equilateral triangle
        else if(nums[0]==nums[1] && nums[1]==nums[2]){
            return "equilateral";
        }
        //Any two sides equal isosceles
        else if(nums[0]==nums[1] || nums[1]==nums[2] || nums[0]==nums[2])return"isosceles";
        else return "scalene";

    }

    public static void main(String[] args) {
        int[] nums={5,6,9};
        System.out.println(triangleType(nums));
    }
}
