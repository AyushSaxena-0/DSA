import java.util.ArrayList;

public class O208Subsequence_ArrayList_Of_ArrayLists {
    public static ArrayList<ArrayList<String>>subArr(String str) {
        //I have to create a outer list which is arraylist of arraylist
        ArrayList<ArrayList<String>> outer = new ArrayList<>();
        //Now i am adding a very first element empty string ""
        outer.add(new ArrayList<>());
        //Selecting each character of string and using pick or skip
        for (int i = 0; i < str.length(); i++) {
            //As arraylist size is changing so we take unique elements
            int curSize = outer.size();
            for (int j = 0; j < curSize; j++) {
                //Note this way of creating a new arraylist as it creates a clone or copy of orignal arraylist in the outer list
                //Otherwise we would be modifying the original list places breaking our code
                ArrayList<String> temp = new ArrayList<>(outer.get(j));
                // At this point, 'outer' already contains all subsequences formed using
                // characters before index i (i.e., excluding current character).
                // For each existing subsequence, we create a new one by including
                // the current character and add it to the list.
                // This ensures we generate all combinations with and without the current character.
                temp.add(str.charAt(i) + "");
                outer.add(temp);
            }
        }
        return outer;
    }
    public static void main(String[] args) {
        System.out.println(subArr("abc"));
    }
}
