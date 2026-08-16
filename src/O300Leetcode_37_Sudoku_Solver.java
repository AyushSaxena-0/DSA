import java.util.Arrays;

public class O300Leetcode_37_Sudoku_Solver {
    //This question looks hard but trust me it is easy bro
    //Just understand the isSafe() function conditions and then put digits from 1 to 9 at every next blank space
    //If no blank space return true and is solved
    //Otherwise backtrack
    //This function is used to find the blank cell coordinate
    public static int[] blankCoordinates(char[][]board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='.')return new int[]{i,j};
            }
        }
        //No blank cell found in this row
        return new int[]{-1,-1};
    }
    public static boolean isSafe(char[][]board,int row,int col,char n){
        //Checking row wise
        for(int i=0;i<board[0].length;i++){
            if(board[row][i]==n)return false;
        }
        //Checking column wise
        for(int i=0;i<board.length;i++){
            if(board[i][col]==n)return false;
        }
        //Check Square Wise
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for(int r = startRow; r < startRow + 3; r++){
            for(int c = startCol; c < startCol + 3; c++){
                if(board[r][c] == n) return false;
            }
        }
        return true;
    }
    public static boolean helper(char[][]board){
        int[] nextBlankElementCoordinate=blankCoordinates(board);
        if(nextBlankElementCoordinate[0]==-1)return true;
        int row=nextBlankElementCoordinate[0];
        int col=nextBlankElementCoordinate[1];
        for(char ch='1';ch<='9';ch++){
            if(isSafe(board,row,col,ch)){
                board[row][col]=ch;
                //Check if this works
                if(helper(board))return true;
                //Backtrack if it doesnt
                board[row][col]='.';
            }
        }
        //Not solved then return false
        return false;
    }
    public static void solveSudoku(char[][] board) {
        helper(board);
    }

    public static void main(String[] args) {
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        solveSudoku(board);
        for(char[]arr:board){
            System.out.println(Arrays.toString(arr));
        }
    }
}
