import java.util.ArrayList;

public class O207Subsequence_Iteration_Method {
    public static ArrayList<String>subIt(String str){
        if(str.isEmpty())return new ArrayList<>();
        ArrayList<String>first=new ArrayList<>();
        first.add("");
        for(int i=0;i<str.length();i++){
            //We make this current size variable as the size of the following iteration
            //We do it as prevents iterating over newly added elements in the same pass
            int curSize=first.size();
            //Now this variable is having a fixed value
            for(int j=0;j<curSize;j++){
                first.add(str.charAt(i)+first.get(j));
            }
        }
        return first;
    }

    public static void main(String[] args) {
        System.out.println(subIt("abcd"));
    }
}
