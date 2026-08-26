public class O316Leetcode_3340_Check_Balanced_String {
    public static boolean isBalanced(String num) {
        int sum=0;
        //There a logic that add at even and substract at odd index at end if string is balanced you should get 0 otherwise the string is not balanced
        for(int i=0;i<num.length();i++){
            //int digit = Integer.parseInt(String.valueOf(num.charAt(i)));
            if(i%2==0)sum=sum+(num.charAt(i)-'0');
            else sum=sum-(num.charAt(i)-'0');
        }
        return sum==0;
    }

    public static void main(String[] args) {
        String str="123456";
        System.out.println(isBalanced(str));
    }
}
