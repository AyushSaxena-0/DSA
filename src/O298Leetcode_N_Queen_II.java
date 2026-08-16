import java.util.ArrayList;
import java.util.List;

public class O298Leetcode_N_Queen_II {
    public static boolean isSafe(boolean[][]board,int row,int col){
        //Checking the column above
        //Kunal complicated these conditions of isSafe() function
        //Try this way,Its easier
        for(int i=0;i<row;i++){
            if(board[i][col])return false;
        }
        int r=row-1;
        int c=col-1;
        while(r>=0&&c>=0){
            if(board[r][c])return false;
            r--;
            c--;
        }
        r=row-1;
        c=col+1;
        while(r>=0&&c<board.length){
            if(board[r][c])return false;
            r--;
            c++;
        }
        return true;
    }
    public static void helper(List<List<String>>list,boolean[][]board,int row,int n){
        if(row==n){
            List<String> currentBoard=new ArrayList<>();
            for(int i=0;i<board.length;i++){
                StringBuilder sb=new StringBuilder();
                for(int j=0;j<board.length;j++){
                    if(board[i][j]){
                        sb.append("Q");
                    }
                    else{
                        sb.append(".");
                    }
                }
                currentBoard.add(sb.toString());
            }
            list.add(currentBoard);
            return;
        }
        //We are checking position in each row column wise
        for(int col=0;col<board.length;col++){
            if(isSafe(board,row,col)){
                //Selecting this position and marking as visited
                board[row][col]=true;
                //Recursively progressing ahead
                helper(list,board,row+1,n);
                //Backtracking
                board[row][col]=false;
                //You dont need to write again as it is already in loop
            }
        }
    }
    public static int totalNQueens(int n) {
        List<List<String>>list=new ArrayList<>();
        boolean[][]board=new boolean[n][n];
        helper(list,board,0,n);
        return list.size();
    }

    public static void main(String[] args) {
        System.out.println(totalNQueens(4));
    }
}
