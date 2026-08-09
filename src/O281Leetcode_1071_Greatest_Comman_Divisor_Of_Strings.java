public class O281Leetcode_1071_Greatest_Comman_Divisor_Of_Strings {
    //You always do mistake in Gcd function
    //Take pen and paper and derive formulae yourself
    public static int gcd(int a,int b){
        if(a==0)return b;
        return gcd(b%a,a);
    }
    public static String gcdOfStrings(String str1, String str2) {
        //Guys this is a new concept and you need to learn it
        //Check if both follow same pattern
        if(!(str1+str2).equals(str2+str1))return"";
        //Otherwise take gcd of both the string length and return substring till there
        int ans=gcd(str1.length(),str2.length());
        return str1.substring(0,ans);

    }

    static void main() {
        System.out.println(gcdOfStrings("ABABABAB","ABABAB"));
    }
}
