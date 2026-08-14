import java.util.ArrayList;
import java.util.List;

public class O292Subset_Iterative_Meathord {
    static List<List<Integer>>subset(int[]nums){
        List<List<Integer>>outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int i=0;i<nums.length;i++){
            int n= outer.size();
            for(int j=0;j<n;j++){
                List<Integer>inner=new ArrayList<>(outer.get(j));
                inner.add(nums[i]);
                outer.add(inner);
            }
        }
        return outer;
    }

    public static void main(String[] args) {
        int[]arr={1,2,3};
        System.out.println(subset(arr));
    }
}
