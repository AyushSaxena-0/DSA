import java.util.ArrayList;
import java.util.List;

public class O239Leetcode_118_Pascal_Triangle {
    public static List<List<Integer>> generate(int numRows) {
        //Creating an outer arraylist
        List<List<Integer>>ans=new ArrayList<>();
        //Notice there are as many rows as numRows
        for(int i=0;i<numRows;i++){
            //Creating an inner arraylist
            List<Integer>inner=new ArrayList<>();
            //first and last element is always 1
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    inner.add(1);
                }
                else{
                    //arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                    //Doing same in ArrayList
                    inner.add(ans.get(i-1).get(j-1)+ans.get(i-1).get(j));
                }
            }
            ans.add(inner);
        }
        return ans;
    }

    static void main() {
        System.out.println(generate(5));
    }
}
