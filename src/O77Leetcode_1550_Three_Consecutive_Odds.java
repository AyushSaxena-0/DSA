public class O77Leetcode_1550_Three_Consecutive_Odds {
    public static boolean threeConsecutiveOdds(int[] arr) {
        boolean ans=false;
        for(int i=1;i<=arr.length-2;i++){
            if((arr[i-1]%2!=0 && arr[i]%2!=0) && arr[i+1]%2!=0){
                ans=true;
            }
            //If you would use else and write ans=false it would on every loop modify existing variable and would
            //result in wrong answer false instead of true
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,6,6,7,8,9,9,9};
        System.out.println(threeConsecutiveOdds(arr));
    }
}
