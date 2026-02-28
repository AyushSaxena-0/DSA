import java.util.Scanner;
import java.util.Arrays;

public class O22Return_Type {

    static int sum(int a,int b){
        return a+b;
        //Returns integer values
    }

    static void text(){
        System.out.println("I am writing this sample text");
        //They have no return type
    }

    static long sum(long a,long b){
        return a+b;//(Method overloading)
        //Return type is long
    }

    static String st_sum(String a ,String b){
        int x =Integer.parseInt(a);
        int y=Integer.parseInt(b);
        int c=x+y;
        return String.valueOf(c);
        //String could also be a return type
    }

    static char al(){
        return 'a';
        //char can be a return type
    }

    static int[] sample_numbers(){
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        arr[1]=26;
        return arr;
        //Return type can be an array
    }

    static boolean intelligent(){
        return true;
        //Return type could also be a boolean expression
    }

    static float percentage(float obtained,float total){
        return ((float)obtained/total)*100;
        //float can be a return type
    }

    static double percentage_2(double obtained,double total){
        return ((double)obtained/total)*100;
        //double can be a return type
    }

    static byte smallNumber() {
        return 10;
    }

    static short shortNumber() {
        return 32000;
    }

    static Object giveSomething() {
        return "Hello";   // could also return Integer, Array, etc.
    }

    //Student class as a return type
    static class Student {
        int id;
        String name;
        //Overriding means overwriting an existing method
        @Override
        public String toString() {
            return "Student{id=" + id + ", name='" + name + "'}";
        }
    }

    static Student getStudent() {
        Student s = new Student();
        s.id = 1;
        s.name = "Ayush";
        return s;
        //Return type can also be a class object
    }

    public static void main(String[] args) {

        System.out.println("Enter the numbers");
        Scanner sc=new Scanner(System.in);

        int a =sc.nextInt();
        int b=sc.nextInt();
        System.out.println(sum(a,b));

        System.out.println("Enter the large numbers");
        long c=sc.nextLong();
        long d=sc.nextLong();
        System.out.println(sum(c,d));

        System.out.println("Enter the String numbers"); //Input is taken as a string here
        String e=sc.next();
        String f=sc.next();
        System.out.println(st_sum(e,f));

        int [] yoyo=sample_numbers();
        System.out.println(Arrays.toString(yoyo));

        boolean x=intelligent();
        System.out.println(x);

        System.out.println(percentage(493.234f,500.00f));
        System.out.println(percentage_2(493.2544567,500));

        System.out.println(al());
        System.out.println(smallNumber());
        System.out.println(shortNumber());
        System.out.println(giveSomething());
        System.out.println(getStudent());
    }
}
