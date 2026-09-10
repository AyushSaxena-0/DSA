import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class O372HackerRank_Game_Of_Two_Stacks {
    public static int twoStacks(int maxSum, List<Integer> a, List<Integer> b) {
        // Write your code here
        //Won't pass all testcases on HackerRank
        //This is a recursive solution you can solve it by DP

        if(maxSum<=0)return 0;
        int e=0;
        int pickA=0;
        int pickB=0;
        //Choose element from a
        if(a.size()>0){
            e=a.get(0);
            a.remove(0);

            if(e<=maxSum)pickA=1+twoStacks(maxSum-e,a,b);
            //Backtrack
            a.add(0,e);
        }
        //Choose element from b
        if(b.size()>0){
            e=b.get(0);
            b.remove(0);
            if(e<=maxSum)pickB=1+twoStacks(maxSum-e,a,b);
            //backtrack
            b.add(0,e);
        }
        return Math.max(pickA,pickB);
    }
//I would add approach later
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(Arrays.asList(4, 2, 4, 6, 1));
        List<Integer> b = new ArrayList<>(Arrays.asList(2, 1, 8, 5));
        int maxSum = 10;
        int result = twoStacks(maxSum, a, b);
        System.out.println(result);
    }
}
