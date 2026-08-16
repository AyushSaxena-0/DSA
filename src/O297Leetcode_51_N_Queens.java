import java.util.*;
public class O297Leetcode_51_N_Queens {
    public static boolean isSafe(boolean[][]board,int row,int col){
        //We only need to check upper side as queens are there only and bottom ones arent there
        //queen is not safe if they are in same row, col,upper right diagnol,upper left diagnol ,down left diagnol and down right diagnol
        //But since we are iterating rows one by one so no two queens would be in same row due to our approach
        //we only need to check upper left,right diagnol and column above

        //Checking same column
        //Kunal complicated these conditions of isSafe() function
        //Try this way,Its easier
        for(int i=0;i<row;i++){
            if(board[i][col])return false;
        }
        //check upper left diagnol
        int m=row-1;
        int n=col-1;
        while(m>=0&&n>=0){
            if(board[m][n])return false;
            m--;
            n--;
        }
        //Upper right diagnol
        m=row-1;
        n=col+1;
        while(m>=0&&n<board.length){
            if(board[m][n])return false;
            m--;
            n++;
        }
        return true;
    }
    public static void helper(boolean[][]board,List<List<String>>ans,int row,int n){
        //I would start with keeping a queen once in every row and move forward and then backtrack
        if(row==n){
            List<String>currentBoard=new ArrayList<>();
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
            ans.add(currentBoard);
            return ;
        }
        //Now try every column in current row
        //and move forward
        //Then do Backtracking
        for(int col=0;col<board.length;col++){
            if(isSafe(board,row,col)){
                board[row][col]=true;
                //Move forward to next rows
                helper(board,ans,row+1,n);
                //Backtrack
                board[row][col]=false;
                //No need to call function again it is already in for loop
            }
        }
    }
    public static List<List<String>> solveNQueens(int n) {
        boolean[][]board=new boolean[n][n];
        List<List<String>>ans=new ArrayList<>();
        helper(board,ans,0,n);
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(solveNQueens(4));
    }
}
