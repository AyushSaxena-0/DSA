import java.util.ArrayList;

public class O213Permutations {
        //In this problem the number of function calls are variable
        //This is unlike the subarray problem where the number of recursive calls
        //are fixed

        //Here we are using this logic substring
        //For loop i=0; i<str.length ; i++
        // [0,i) + ch + [i,str.length+1) As second term is exclusive so use substring(i)
        // [0,i) + ch + substring(i) string from index till end

        public static void permute(String p,String up){
            if(up.isEmpty()){
                System.out.println(p);
                return;
            }
            char ch=up.charAt(0);

            for(int i=0;i<=p.length();i++){
                String f=p.substring(0,i);
                String s=p.substring(i);
                permute(f+ch+s,up.substring(1));
            }
        }

    public static void main(String[] args) {
        permute("","abc");
    }
}
