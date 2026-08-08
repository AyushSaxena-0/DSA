public class O278Leetcode_2601_Prime_Substraction_Operation {
    public static boolean isPrime(int x){
        if(x<2)return false;
        for(int i=2;i*i<=x;i++){
            if(x%i==0)return false;
        }
        return true;
    }

    public static int largestPrime(int x){
        for(int i=1;i<x;i++){
            int p=x-i;
            if(isPrime(p))return p;
        }
        return 0;
    }
    public static boolean primeSubOperation(int[] nums) {
        //Now i have to choose each element and substract a prime less than element to make element smaller than next element
        //I would substract such that nums[i]-p>nums[i-1]; for i>0
        // p<nums[i]-nums[i-1]
        //if i=0 p=nums[i];
        int limit;

        for(int i=0;i<nums.length;i++){

            if(i==0)limit=nums[0];
            else{
                limit=nums[i]-nums[i-1];
            }
            int prime=largestPrime(limit);

            nums[i]=nums[i]-prime;
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=nums[i-1])return false;
        }
        return true;
    }

    static void main() {
        System.out.println(primeSubOperation(new int[]{4,9,6,10}));
    }
}
