import java.util.Arrays;

public class O30Variable_Argumens {
    //When we don't know how many arguments would be entered by user we use variable arguments just like args and kwargs in python
    //only three dots before variable int ...x is variable args
    //Stores data in array
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void multiple(int a,int b,String ...v){
        //Also note that variable argument variable should come at the end, otherwise there would be confusion to determine which id last variable
        // multiple(int a, String...v,int b) would not work as there would be no end to variable arguments
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(v));
    }

    public static void main(String[] args) {
        fun(1,2,3,4,5,6,7,8,8);
        multiple(1,2,"Ayush is dumb ass","Ayush is cool","Ayush is the best","Ayush is Kayastha boy in demand");
    }
}
