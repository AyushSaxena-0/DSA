public class O264Leetcode_877_Stone_Game {
    public static int helper(int[]piles,int left,int right){
        //Base Case
        if(piles[left]==piles[right])return piles[left];
        //If left one is picked
        int leftPick=piles[left]-helper(piles,left+1,right);
        //If right one is not picked
        int rightPick=piles[right]-helper(piles,left,right-1);
        //Return the possibility of winning
        return Math.max(leftPick,rightPick);
    }
    public static boolean stoneGame(int[] piles) {
        //This question was just like old question
        int left=0;
        int right=0;
        return helper(piles,left,right)>0;
    }

    static void main() {
        System.out.println(stoneGame(new int[]{5,3,4,5}));
    }
}
