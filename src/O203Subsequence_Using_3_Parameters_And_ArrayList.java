import java.util.ArrayList;

public class O203Subsequence_Using_3_Parameters_And_ArrayList {
    //Dry Run this code to understand what and how is happening
    //I admit it is really tough to see through recursion
    //Debug this code and see how it works for visual clarity
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
