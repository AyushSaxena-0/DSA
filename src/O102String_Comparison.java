//Primitives like int ,char etc. are stored in stack
//Non Primitives are stored in Heap memory

public class O102String_Comparison {
    public static void main(String[] args) {
        String a=new String("Kunal");
        String b=new String("Kunal");
        System.out.println(a==b);//a==b would be false
        System.out.println(a.equals(b));//a.equals(b) would be true
        //a==b check to if both the variable a and b points to same object in String pool
        //Hence we use a.equals(b) to check if both have same value
        //Doesn't matter if both are same object or not
    }
}
