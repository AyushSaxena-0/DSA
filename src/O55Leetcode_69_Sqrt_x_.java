public class O55Leetcode_69_Sqrt_x_ {
    //integeral value of Square root is given intelligently by binary search
    public static int mySqrt(int x) {
        long start=1;
        //Alter take end=x/2 as any number greater than or equal to 2 would have its sqare root in tange x/2 (Its For any integer x ≥ 2, the square root of x is always less than or equal to x/2, because any number greater than x/2 when squared exceeds x. Hence, the search space can be limited to [1, x/2]
        long end=x;
        if(x<2)return x;
        while(start<=end){
            long mid=start+(end-start)/2;
            if(mid*mid==x){
                return (int)mid;
            }
            else if(mid*mid<x){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return (int)end;
    }

    public static void main(String[] args) {
        int number=6789876;
        System.out.println(mySqrt(number));
    }
}

