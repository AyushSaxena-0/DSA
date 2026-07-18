public class O220Leetcode_1979_Find_GCD {
    public static int maxN(int[]nums){
        int max=Integer.MIN_VALUE;
        for(int m:nums){
            if(max<m){
                max=m;
            }
        }
        return max;
    }

    public static int minN(int[]nums){
        int min=Integer.MAX_VALUE;
        for(int m:nums){
            if(min>m){
                min=m;
            }
        }
        return min;
    }
    public static int gcd(int a , int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public static int findGCD(int[] nums) {
        int max=maxN(nums);
        int min=minN(nums);
        return gcd(max,min);
    }

    public static void main(String[] args) {
        int[] nums={2,6,7,8,9,100};
        System.out.println(findGCD(nums));
    }
}
