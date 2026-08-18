public class O302Leetcode_3456_Find_Special_Ssubstring_Of_Length_K {
    public static boolean hasSpecialSubstring(String s, int k) {
        //Always remember s.substring(i,j) would have elements form i to j-1
        for(int i=0;i<s.length();i++){
            for(int j=i;j<=s.length();j++){
                String ans=s.substring(i,j);
                //Given condition
                if(ans.length()!=k)continue;
                //Given condition
                if(i>0&&s.charAt(i-1)==s.charAt(i))continue;
                //Given Condition
                if(j<s.length()&&s.charAt(j-1)==s.charAt(j))continue;//s.substring(i,j) would have elements form i to j-1
                //So we are using s.charAt(j-1) to compare with s.charAt(j) as answer has s.substring(i,j)
                //That means letters from i to j-1 not j
                boolean same=true;
                for(int l=0;l<ans.length();l++){
                    if(ans.charAt(l)!=ans.charAt(0)){
                        same=false;
                    }
                }
                if(same){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean twoPointers(String s,int k){
        int i=0;
        int n=s.length();
    //Optimised approach
        while(i<n){
            int j=i;
            while(j<n&&s.charAt(j)==s.charAt(i)){
                j++;
            }
            if(j-i==k){
                return true;
            }
            i=j;
        }
        return false;
    }

    public static void main(String[] args) {
        String s="aaaaac";
        int k=5;
        System.out.println(hasSpecialSubstring(s,k));
        System.out.println(twoPointers(s,k));
    }
}
