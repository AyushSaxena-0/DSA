import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class O406Leetcode_986_Interval_List_Intersections {
    public static int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<List<Integer>> list = new ArrayList<>();
        //Since both are sorted so i would use two pointer approach
        int i = 0;
        int j = 0;
        while (i < firstList.length && j < secondList.length) {
            //Detect if there is an overlap
            int start1 = firstList[i][0];
            int end1 = firstList[i][1];
            int start2 = secondList[j][0];
            int end2 = secondList[j][1];
            //Find the possible intersection
            int start = Math.max(start1, start2);
            int end = Math.min(end1, end2);
            if (start <= end) {
                //If valid intersection then add
                //Note this step
                List<Integer> inner = new ArrayList<>();
                inner.add(start);
                inner.add(end);
                list.add(inner);
            }
            //move the smaller end
            if (end1 < end2) {
                i++;
            } else {
                j++;
            }
        }
        int[][] ans = new int[list.size()][2];
        for (int k = 0; k < list.size(); k++) {
            ans[k][0] = list.get(k).get(0);
            ans[k][1] = list.get(k).get(1);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] firstList = {
                {0, 3},
                {5, 9},
                {12, 16},
                {18, 20},
                {22, 25}
        };

        int[][] secondList = {
                {1, 2},
                {4, 7},
                {8, 13},
                {15, 19},
                {20, 23},
                {26, 30}
        };

        int[][] result = intervalIntersection(firstList, secondList);
        System.out.println(Arrays.deepToString(result));
    }
}