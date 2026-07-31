import org.w3c.dom.ls.LSOutput;

public class O243Leetcode_121_Best_Time_To_Buy_And_Sell_Stocks {

    public static int maxProfit(int[] prices) {
        //Note this two pointer approach
        //I am going to iterate over the array and keep track of minimum value
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;

        //Iterating over the prices array
        for(int price:prices){
            if(price<minPrice){
                minPrice=price;
            }
            else{
                maxProfit=Math.max(maxProfit,price-minPrice);
            }
        }
        return maxProfit;
    }

    static void main() {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
