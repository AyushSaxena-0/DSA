import java.util.ArrayList;

public class O214Permutations_ArrayList {
    public static ArrayList<String>perm(String p,String up){
        ArrayList<String>temp=new ArrayList<>();
        if(up.isEmpty()){
            temp.add(p);
            return temp;
        }

        char ch=up.charAt(0);

        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String l=p.substring(i);
            ArrayList<String> a=perm(f+ch+l,up.substring(1));
            temp.addAll(a);
        }
        return temp;
    }

    public static void main(String[] args) {
        System.out.println(perm("","abc"));
    }
}
