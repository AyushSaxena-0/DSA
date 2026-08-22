import java.util.Arrays;

public class O307Leetcode_452_Minimum_Number_Of_Arrows_To_Burst_Balloons {
    //Note this question and approach
    public static int findMinArrowShots(int[][] points) {

        //I think in this question we need to find the intersection and that too in such a way that the arrows are minimum

        int arrows=1;
        //We take arrow as one as we reset intersection only when left > right so first one is needed to be counted before

        //You need to know lambda functions and wrapper classes to understand sorting done here
        Arrays.sort(points, (a, b) -> Integer.compare(a[0],b[0]));
        //Sorted according to first element

        int left=points[0][0];
        int right=points[0][1];

        for(int i=0;i<points.length;i++){
            left=Math.max(left,points[i][0]);
            right=Math.min(right,points[i][1]);

            //No comman intersection
            if(left>right){
                arrows++;

                //start new group
                left=points[i][0];
                right=points[i][1];
            }
        }
        return arrows;
    }

    public static void main(String[] args) {
        int[][]points={
                {10,16},
                {2,8},
                {1,6},
                {7,12}
        };
        System.out.println(findMinArrowShots(points));
    }
}
