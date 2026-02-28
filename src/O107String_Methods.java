import java.util.Arrays;

public class O107String_Methods {
    public static void main(String[] args) {
        String name="Kunal Kushwaha";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        //Note original name object is unchanged
        System.out.println(name);
        String a="  Ayush,Akhilendra,Aman,Amrendra";
        System.out.println(a.strip());//White spaces are removed from both sides
        String[]arr=a.strip().split(",");
        System.out.println(Arrays.toString(arr));
    }
}
