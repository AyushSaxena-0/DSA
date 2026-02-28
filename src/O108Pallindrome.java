public class O108Pallindrome {
    public static boolean isPallindrome(String str){
        if(str==null || str.length()==0)return true;
        StringBuilder sb = new StringBuilder(str);
        String rev=sb.reverse().toString();
        return rev.equals(str);
    }

    public static boolean isPallindrome2(String str){
        if(str==null || str.length()==0)return true;
        int start=0;
        int end=str.length()-1;
        //Alter use for loop int start=str.charAt(i)
        //                   int end=str.charAt(str.length()-i);
        while(start<=end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = null;
        System.out.println(isPallindrome(str));
        System.out.println(isPallindrome2(str));
    }
}
