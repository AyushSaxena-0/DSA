public class O408Leetcode_4061_Minimum_Queen_Moves_To_Reach_Target {
    public static int minQueenMoves(int[] source, int[] target) {
        //Queen can moves any number of blocks across rows columns or diagnol
        if(source[0]==target[0]&&source[1]==target[1])return 0;
        //Only three possible outcomes 1 if both are diagnolly aligned 2 if not, and 0 if same
        if(Math.abs(source[0] - target[0]) == Math.abs(source[1] - target[1]))return 1;//Straighline
        //If in same row or same column then also one move is required
        if(source[0]==target[0]||source[1]==target[1])return 1;
            //Otherwise two moves minimum
        else return 2;
    }

    public static void main(String[] args) {
        int[]source={8,1};
        int[]target={1,8};
        System.out.println(minQueenMoves(source, target));
    }
}
