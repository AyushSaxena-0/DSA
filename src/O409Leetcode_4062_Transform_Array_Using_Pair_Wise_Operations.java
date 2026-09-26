public class O409Leetcode_4062_Transform_Array_Using_Pair_Wise_Operations {
    public static boolean canTransform(int[] source, int[] target) {
        //Such an easy question
        long sum1=0;
        long sum2=0;

        for(int x:source){
            sum1+=x;

        }
        for(int x:target){
            sum2+=x;
        }
        return sum1==sum2;
    }

    public static void main(String[] args) {
        int[]source={1,2,3};
        int[]target={0,2,4};
        System.out.println(canTransform(source, target));
    }
}
