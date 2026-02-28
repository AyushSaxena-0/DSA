public class O68Leetcode_258_Add_Digits {
    public static int digits(int num){
        int digits=0;
        while(num>0){
            digits++;
            num=num/10;
        }
        return digits;
    }

    public static int sumf(int num){
        int sum=0;
        int digit=0;
        while(num>0){
            digit=num%10;
            sum=sum+digit;
            num=num/10;
        }
        return sum;
    }
    public static int addDigits(int num) {
        int sum=sumf(num);
        int digit=digits(num);
        while(digit>1){
            sum=sumf(sum);
            digit=digits(sum);
        }
        return sum;

    }
//Alter use
//public int addDigits(int num) {
//    while(num >= 10){
//        num = sumf(num);
//    }
//    return num;
//}
    public static void main(String[] args) {
        int num=23;
        System.out.println(addDigits(num));
    }
}
