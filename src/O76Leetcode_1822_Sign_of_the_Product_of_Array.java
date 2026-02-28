public class O76Leetcode_1822_Sign_of_the_Product_of_Array {
    public static int signFunc(int[]nums){
        int count=0;
        for(int num:nums){
            if(num<0){
                count++;
            }
            else if(num==0){
                return 0;
            }
        }
        if(count%2==0)return 1;
        else if(count%2==1)return -1;
        return 0;
    }

    public static void main(String[] args) {
        int[]nums={1,-22,34,-11222};
        System.out.println(signFunc(nums));
    }
}
