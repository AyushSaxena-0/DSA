import java.util.*;
public class O221Leetcode_1260_Shift_2D_Grid {

    public static int[][] shiftedArray(int[][]grid,int k){

        for(int i=0;i<k;i++){
            int[][] ans = new int[grid.length][];
            for (int l = 0; l < grid.length; l++) {
                //Learn how to copy a 2D Array
                ans[l] = Arrays.copyOf(grid[l], grid[l].length);
            }
            for(int row=0;row<grid.length;row++){
                for(int col=0;col<grid[row].length;col++){
                    if(row==grid.length-1&&col==grid[row].length-1){
                        ans[0][0]=grid[row][col];
                    }
                    else if(col==grid[row].length-1){
                        ans[row+1][0]=grid[row][col];
                    }
                    else{
                        ans[row][col+1]=grid[row][col];
                    }
                }
            }
            grid=ans;
        }
        return grid;
    }
    public static List<List<Integer>> convert(int[][] grid) {

        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < grid.length; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < grid[i].length; j++) {
                row.add(grid[i][j]);
            }
            list.add(row);
        }
        return list;
    }
    public static List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int[][]ans=shiftedArray(grid,k);
        List<List<Integer>>list=convert(ans);
        return list;
    }

    static void main() {

        int[][] grid = {{1,2,3},{4,5,6},{7,8,9}};
        int k = 3;
        List<List<Integer>> ans = shiftGrid(grid,k);
        System.out.println(ans);
    }
}
