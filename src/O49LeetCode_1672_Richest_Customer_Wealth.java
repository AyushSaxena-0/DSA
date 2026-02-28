//https://leetcode.com/problems/richest-customer-wealth/
public class O49LeetCode_1672_Richest_Customer_Wealth {
    static int maximumWealth(int[][] accounts){
        int maxsum=0;

        for (int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
            }
            //Alternative use Math.max(sum,maxsum) for finding max
            if (sum>maxsum){
                maxsum=sum;
            }
        }

        return maxsum;
    }

    public static void main(String[] args) {

        int[][]accounts={{1,2,3},{3,2,1},{7,8,9}};
        System.out.println(maximumWealth(accounts));

    }


}
