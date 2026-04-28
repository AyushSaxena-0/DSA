public class O215Permutations_Count {
    public static int per(String p,String up){
        //I can count by counting the size of arraylist in previous question
        //However I am counting to build approach
        if(up.isEmpty()){
            return 1;
        }
        char ch=up.charAt(0);
        int count=0;
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String l=p.substring(i);
            count=count+per(f+ch+l,up.substring(1));
        }
    return count;
    }

    public static void main(String[] args) {
        System.out.println((per("","abc")));
    }
}
