import java.util.Arrays;
import java.util.List;
public class O296MazeProblem_All_Path_Print_Matrix_with_numbers {
    static void printMatrixAllPath(int[][]matrix,boolean[][]visited,int[][]ans,int row,int col,int num){
        //I am writing here the stopping condition
        if(row>matrix.length-1||col>matrix[0].length-1)return;
        if(row==matrix.length-1 && col==matrix[0].length-1){
            ans[row][col]=num;
            //Print 2D answer Matrix
            for(int i=0;i<ans.length;i++){
                for(int j=0;j<ans[0].length;j++) {
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        if(visited[row][col])return;
        //Now i can move left right up and down
        //Using backtracking
        visited[row][col]=true;
        //Moving up
        ans[row][col]=num;
        if(row>0)printMatrixAllPath(matrix,visited,ans,row-1,col,num+1);
        //Moving down
        if(row<matrix.length-1)printMatrixAllPath(matrix,visited,ans,row+1,col,num+1);
        //Moving left
        if(col>0)printMatrixAllPath(matrix,visited,ans,row,col-1,num+1);
        //Moving Right
        if(col<matrix[0].length-1)printMatrixAllPath(matrix,visited,ans,row,col+1,num+1);
        //Backtracking
        visited[row][col]=false;
        ans[row][col]=0;
        return;
    }

    public static void main(String[] args) {
        int[][]matrix={
                {1,1,1},
                {1,1,1},
                {1,1,1}
        };
        boolean[][]visited=new boolean[matrix.length][matrix[0].length];
        int[][]ans=new int[matrix.length][matrix[0].length];
        printMatrixAllPath(matrix,visited,ans,0,0,1);
    }
}
