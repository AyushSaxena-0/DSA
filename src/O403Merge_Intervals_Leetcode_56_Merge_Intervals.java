import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class O403Merge_Intervals_Leetcode_56_Merge_Intervals {
    public static int[][] merge(int[][] intervals) {
        //Since i dont know exactly how many elements would be there in ressult so i make an arraylist
        List<List<Integer>>list=new ArrayList<>();

        Arrays.sort(intervals,(a, b)->Integer.compare(a[0],b[0]));

        int start1=intervals[0][0];
        int end1=intervals[0][1];


        for(int i=1;i<intervals.length;i++){

            int start2=intervals[i][0];
            int end2=intervals[i][1];

            if(start2<=end1){
                end1=Math.max(end1,end2);
            }
            else{
                //Add in list and update start1,end1 if no overlap is detected
                List<Integer>inner=new ArrayList<>();
                inner.add(start1);
                inner.add(end1);
                list.add(inner);
                start1=start2;
                end1=end2;
            }
        }
        List<Integer>inner=new ArrayList<>();
        inner.add(start1);
        inner.add(end1);
        list.add(inner);
        int[][]ans=new int[list.size()][2];
        //Copy elements from list to array which is required format
        for(int i=0;i<list.size();i++){
            for(int j=0;j<2;j++){
                ans[i][j]=list.get(i).get(j);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][]arr=new int[][]{
                {1,5},
                {2,10},
                {15,40},
        };
        int[][]ans=merge(arr);
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans.length;j++){
                System.out.print(ans[i][j]+" ");
            }
        }
    }
}
