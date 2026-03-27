public class O147Modulo_Properties {
    //(a+b)%m=((a%m)+(b%m))%m
    //(a-b)%m=((a%m)-(b%m)+m)%m We add m because modulo can never be negative
    //(a*b)%m=((a%m)*(b%m))%m
    //(a/b)%m=((a%m)*(b^-1%m))%m
    //Where (b^-1%m) is a multiplicative modulo inverse
    //(6*y)%7=1
    //Tum pooch rahe ho  6 ko kis number se multiply karein ki mod 7 lene par 1 aaye?
    //So answer is 6 as 6*6=36%7=1
    //(a%b)%b=a%b
    //m%m=0

    //Fermat's theorem
    // (ab^p-1)%p=a%p
    public static void main(String[] args) {
        System.out.println("Learn this okay!");
    }

}
