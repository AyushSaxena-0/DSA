public class O198Recursion_Subsets_and_Subsequences_Introduction {
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

    public static void main(String[] args) {
        subseq("Ayush","");
    }
}
