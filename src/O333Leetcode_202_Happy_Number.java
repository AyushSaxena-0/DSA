import java.util.HashSet;
//Can you imagine this is a Google Question
public class O333Leetcode_202_Happy_Number {
    public static int sumOfSquareOfDigits(int n){
        //finding the digits and storing sum of square of digit
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
    //Alternative approach
    //The sum of square of digits would start repeating thus it could be imagined like a linked list containing a cycle
    //Take two pointers fast and slow do square two times in fast pointer and one time in slow
    //If they meet when the sum==1
    //Otherwise it is just a endless loop and sum never reaches 1 so return false
    public static boolean isHappy2(int n){
        int slow=n;
        int fast=n;
        do {
            slow = sumOfSquareOfDigits(slow);
            fast = sumOfSquareOfDigits(sumOfSquareOfDigits(fast));//Moving two times
        }while(slow!=fast);
        if(slow==1)return true;
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isHappy(19));
        System.out.println(isHappy2(19));
    }
}
