public class O326Leetcode_3876_Construct_Uniform_Parity_Array_II {
    public static boolean uniformArray(int[] nums1) {
        //Note we have to make everything odd
        //For that we need to find the smallest odd number then check if there is any even number lessthan or equal to minimum odd number
        //If there is no odd number then everything is even return true
        int minOdd=Integer.MAX_VALUE;
        for(int num:nums1){
            if(num%2==1){
                minOdd=Math.min(minOdd,num);
            }
        }
        //Now check whether there is a smaller number than minOdd so that they coud be made even or odd
        if(minOdd!=Integer.MAX_VALUE){
            for(int num:nums1){
                if(num%2==0&&num<=minOdd)return false;
            }
        }
        //otherwise all are even
        return true;
    }

    public static void main(String[] args) {
        boolean ans=uniformArray(new int[]{1,2,3,4,5,6,7,8,9,10});
        System.out.println(ans);
    }
}
