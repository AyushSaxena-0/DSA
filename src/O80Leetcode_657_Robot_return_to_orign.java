public class O80Leetcode_657_Robot_return_to_orign {
    public static boolean judgeCircle(String moves) {
        char up='U';
        char down='D';
        char left='L';
        char right='R';
        int cup=0;
        int cdown=0;
        int cleft=0;
        int cright=0;
        //Alter use x++ and x-- for x axis and y++ and y-- for y axis movements so only two variables would be used
        for(char ch:moves.toCharArray()){
            if(ch==up){
                cup++;
            }
            else if(ch==down){
                cdown++;
            }
            else if(ch==left){
                cleft++;
            }
            else{
                cright++;
            }
        }
        if(cup==cdown && cleft==cright)return true;
        return false;
    }

    public static void main(String[] args) {
        String moves="UDUDL";
        System.out.println(judgeCircle(moves));
    }
}
