import java.util.HashSet;
import java.util.Set;

public class O84Leetcode_2652_Sum_Multiples {
    public static int sumOfMultiples(int n) {
        int sum=0;
        Set<Integer> ans=new HashSet<>();
        for(int i=1;i<=n;i++){
            if(i*3<=n) {
                ans.add(i*3);
            }
            if(i*5<=n){
                ans.add(i*5);
            }
            if(i*7<=n){
                ans.add(i*7);
            }
        }
        for(int val:ans){
            sum=sum+val;
        }
        return sum;
    }
    //Note this approach in not affective as it does a lot of waste check if i*5>=n then checking i*7 is useless
    //use i<= n/3,n/5,n/7 in for loop
    // Alternative is use
    // for(int i = 1; i <= n; i++) {
    //            if(i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
    //                sum += i;
    //            }
    //        }
    //Above approach is fastest

    public static void main(String[] args) {
        int n=1000;
        System.out.println(sumOfMultiples(n));
    }
}
