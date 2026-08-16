import java.util.*;

public class O299N_Knight_Problem {
    //Knight is known as a horse in chess okay!
    //Check horse moves on this website
    // https://queensofchess.com/how-to-play-chess/
    static boolean isSafe(boolean[][]board,int row,int col){
        //I am going to check moves above only as below there is no horse
        //two up and one left
        if(row>1&&col>0&&board[row-2][col-1])return false;
        //two up one right
        if(row>1&&col<board[0].length-1&&board[row-2][col+1])return false;
        //two left one up
        if(col>1&&row>0&&board[row-1][col-2])return false;
        //two right one up
        if(row>0&&col<board[0].length-2&&board[row-1][col+2])return false;
        return true;
    }
    static void helper(List<List<String>>list, boolean[][]board, int row, int col, int n){
        if(n==0){
            List<String>currBoard=new ArrayList<>();
            for(int i=0;i<board.length;i++){
                StringBuilder sb=new StringBuilder();
                for(int j=0;j<board[0].length;j++) {
                    if (board[i][j]) {
                        sb.append("H");
                    } else {
                        sb.append("X");
                    }
                }
                currBoard.add(sb.toString());
            }
            list.add(currBoard);
            return;
        }
        if(row>=board.length)return;
        if(col>=board.length){
            //Column reaches its end
            //set column to 0 and increment row
            helper(list, board, row + 1, 0, n);
            return;
        }
        //Now i am picking a spot on row and col
        if(isSafe(board,row,col)) {
            //Place
            board[row][col] = true;
            helper(list, board, row, col + 1, n - 1);
            //Backtrack
            board[row][col] = false;
        }
        helper(list, board, row, col + 1, n);
    }

    public static void main(String[] args) {
        boolean[][]board=new boolean[4][4];
        List<List<String>>list=new ArrayList<>();
        helper(list,board,0,0,3);
        System.out.println(list.size());
    }
}
