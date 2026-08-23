public class O309Leetcode_1927_Sum_Game {
    public static boolean sumGame(String num) {

        int sum_left=0;
        int sum_right=0;

        if(!num.contains("?")){
            for(int i=0;i<num.length()/2;i++){
                sum_left+=Integer.parseInt(num.charAt(i)+"");
            }
            for(int i=num.length()/2;i<num.length();i++){
                sum_right+=Integer.parseInt(num.charAt(i)+"");
            }
            return !(sum_left==sum_right);
        }
        //Otherwise
        //Count question mark on left

        int leftQ=0;
        int rightQ=0;

        //Left
        for(int i=0;i<num.length()/2;i++){
            if(num.charAt(i)=='?'){
                leftQ++;
            }
            else{
                sum_left+=Integer.parseInt(num.charAt(i)+"");
            }
        }
        //Right
        for(int i=num.length()/2;i<num.length();i++){
            if(num.charAt(i)=='?'){
                rightQ++;
            }
            else{
                sum_right+=Integer.parseInt(num.charAt(i)+"");
            }
        }
        int q=leftQ-rightQ;
        //If q is negative right has more q than left
        //If right has q more than left then all i can do is add 9*q
        //Bob wants to become equal
        //He can do it by adding (-diff)
        //Scores of bob and alice could be grt or less for scores to be unequal and alice to win
        //But scores should not be equal hence we use the below logic
        int diff = sum_left - sum_right;
        //The only losing case for Alice is exact equality
        return diff * 2 != -9 * q;
    }

    public static void main(String[] args) {
        String num="?3295???";
        System.out.println(sumGame(num));

    }
}
