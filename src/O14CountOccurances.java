import java.util.Scanner;
public class O14CountOccurances {
    public static void main(String[] args){
//        //For in an array
//        int [] arr={1,2,3,4,1,2,3,4,5,6,5,5,5,5,5};
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the number whose occurance is to be counted");
//        int target=sc.nextInt();
//        int freq=0;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==target){
//                freq++;
//            }
//        }
//        System.out.println(freq);
        //For occurance in a number
//        long num=12347885555555L;
//        Scanner sc=new Scanner(System.in);
//        long target=sc.nextInt();
//        long count=0;
//        while(num>0){
//            long d=num%10;
//            if (d == target) {
//                count++;
//                num=num/10;
//            }
//            else{
//                num=num/10;
//                }
//            }
//        System.out.println(count);
//String method convert the number into string and iiterate through each charecter to find frequency
        long number=12345645454546321L;
        long target=1;
        char ch=Long.toString(target).charAt(0);
        int count=0;
        String s =Long.toString(number);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==ch){
                count++;
            }
        }
        System.out.println(count);











    }
}
