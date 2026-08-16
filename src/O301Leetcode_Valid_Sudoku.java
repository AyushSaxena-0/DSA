public class O301Leetcode_Valid_Sudoku {
    public static boolean isSafe(char[][]board,int row,int col,char n){
        //Checking row wise
        for(int i=0;i<board[0].length;i++){
            //Skipping the current cell as otherwise it would be found
            if(i==col)continue;
            if(board[row][i]==n)return false;
        }
        //Checking column wise
        for(int i=0;i<board.length;i++){
            //Skipping the current cell as otherwise it would be found
            if(i==row)continue;
            if(board[i][col]==n)return false;
        }
        //Check Square Wise
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for(int r = startRow; r < startRow + 3; r++){
            for(int c = startCol; c < startCol + 3; c++){
                //Skipping the current cell as otherwise it would be found
                if(r==row&&c==col)continue;
                if(board[r][c] == n) return false;
            }
        }
        return true;
    }
    public static boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j]=='.')continue;
                if(!isSafe(board,i,j,board[i][j]))return false;
            }
        }
        return true;
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

        System.out.println(isValidSudoku(board));
    }
}
