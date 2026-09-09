public class O371Leetcode_3870_Count_Commas_In_Range {
    public static int countCommas(int n) {
        if(n-1000<0)return 0;
        return 1+countCommas(n-1);
    }

    public static void main(String[] args) {
        System.out.println(countCommas(10000));
    }
}
