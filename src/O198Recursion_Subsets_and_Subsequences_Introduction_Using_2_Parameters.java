import java.util.ArrayList;

public class O198Recursion_Subsets_and_Subsequences_Introduction_Using_2_Parameters {
    //Subsets include non-adjacent collection
    //Subset is for array and subsequence is for string
    //This pattern of taking some elements and removing some is known as subset problem
    static void subseq(String str, String ans){
        if(str.isEmpty()){
            //Since we are not returning anything we are just printing the ans String
            System.out.println(ans);
            return;
        }
        //Pick the element
        subseq(str.substring(1),ans+str.charAt(0));

        //Skip the element
        subseq(str.substring(1),ans);
    }
    static ArrayList<String> subseq2(String str, String ans){
        if(str.isEmpty()){
            //Since we are not returning anything we are just printing the ans String
            ArrayList<String>list=new ArrayList<>();
            list.add(ans);
            return list;
        }
        //Pick the element
        //Whenever you are not passing an arraylist you need to store value in arraylists
        ArrayList<String>left=subseq2(str.substring(1),ans+str.charAt(0));
        //Skip the element
        ArrayList<String>right=subseq2(str.substring(1),ans);

        //Adding all the elements in one list and then returning
        left.addAll(right);
        return left;
    }

    public static void main(String[] args) {
        subseq("abc","");
        System.out.println(subseq2("abc",""));
    }
}
