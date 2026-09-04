import java.util.HashSet;

public class O333Leetcode_202_Happy_Number {
    public static int sumOfSquareOfDigits(int n){
        //finding the digites and storing sum of square of digit
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum+=(int)Math.pow(digit,2);
            n=n/10;
        }
        return sum;
    }
    //I thought that if there is one digit in number it cannot become happy which is not true always
    //Butstop when the sum starts repeting
    //There is no going back if the sum gets repeated
    public static boolean isHappy(int n) {
        int sum=sumOfSquareOfDigits(n);
        HashSet<Integer> set=new HashSet<>();
        //Once the sum reaches one it cannot climb up as square of sum i.e 1^2 is always 1
        //So break when the sum reaches 1
        while(sum!=1){
            if(set.contains(sum))return false;
            set.add(sum);
            sum=sumOfSquareOfDigits(sum);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
}
