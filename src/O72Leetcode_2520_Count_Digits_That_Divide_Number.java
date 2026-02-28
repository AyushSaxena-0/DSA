public class O72Leetcode_2520_Count_Digits_That_Divide_Number {
    public static int countDigits(int num) {
        //Simple we use temp to check divisiblity from orignal number as num changes everytime to num/10 in loop
        int temp=num;
        int count=0;
        while(num>0){
            int digit=num%10;
            if(temp%digit==0){
                count++;
            }
            num=num/10;
        }
        return count;
    }

    public static void main(String[] args) {
        int num=123456;
        System.out.println(countDigits(num));
    }
}
