import java.util.ArrayList;

public class O203Subsequence_ArrayList {

    static ArrayList<String>subseq(String p,String q,ArrayList<String>list){
        if(p.isEmpty()){
            list.add(q);
            return list;
        }
        //Pick
        char ch=p.charAt(0);
        subseq(p.substring(1),q+ch,list);
        //Skip
        subseq(p.substring(1),q,list);
        return list;
    }

    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        System.out.println(subseq("abc","",list));
    }
}
