public class O2Primitives {
    public static void main(String[] args){
        //Primitives are data types which cannot be broken even further
        int x=56;
        float marks=98.6f; //Note you need to add f in end of float number ,this is done to remove confusion between float and double by the compiler.A decimal is by default taken as Double by default, so not writing f will give error as you declare variable float and assigning double integer
        double y=2.12;
        char z='a';
        long largeInteger=123456789876543L; //Similarly large integer is taken a int type so we need to write "L" at the end to tell compiler that they are long.
        boolean check =false;
        int a=2_00_000;// _ would be ignored
        System.out.println(a);


    }
}
