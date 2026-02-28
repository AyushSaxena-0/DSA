public class O6Examples_Of_Typecasting {
    public static void main(String[] args){

        byte b=42;
        char c='a';
        short s=1024;
        int i=5000;
        float f=5.67f;
        double d=5.647;
        double result=0.1245;
        double result2=(f*b)+(i/c)-(d-s);
        System.out.println(((f*b)+" "+(i/c)+" "+(d-s)));
        System.out.println(result);

    }
}
