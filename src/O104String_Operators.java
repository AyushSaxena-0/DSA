import java.util.ArrayList;

public class O104String_Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');//ASCI value is added
        System.out.println("a"+"b");//Strings are concatenated
        System.out.println('a'+3);//100
        System.out.println((char)('a'+3));//d is output as it converts 100 to character
        System.out.println("a"+1);//String is concatenated to give a1
        //"a"+1 becomes "a"+"1"
        //As "a"+1 calls integer would be converted to Integer(wrapper class)
        // which makes it toString
        System.out.println("Kunal"+new ArrayList<>());
        System.out.println("Kunal"+new Integer(56));
        //System.out.println(new ArrayList<>()+new Integer(56));
        //Above line won't work
        System.out.println(new ArrayList<>()+""+new Integer(56));
        // + would work if both of them are primitives or if they are object atleast one of them needs to be
        //String type
        //In java operator overloading is not supported unlike c++ or python
        //Only one case of operator overloading is string in java
    }
}
