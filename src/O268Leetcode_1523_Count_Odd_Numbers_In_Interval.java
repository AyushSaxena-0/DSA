public class O268Leetcode_1523_Count_Odd_Numbers_In_Interval {
    public static int isOdd(int x){
        //Note x & 1 gives an integer 0 or 1
        //Which is not a boolean it is an integer
        //Thus your function should be of return type Integer
        return (x&1);
    }
    public static int countOdds(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++){
            if(isOdd(i)==1){
                count++;
            }
        }
        return count;
    }

    static void main() {
        System.out.println(countOdds(3, 7));
    }
}
