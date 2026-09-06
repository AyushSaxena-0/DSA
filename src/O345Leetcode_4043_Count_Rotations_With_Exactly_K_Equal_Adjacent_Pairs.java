public class O345Leetcode_4043_Count_Rotations_With_Exactly_K_Equal_Adjacent_Pairs {
    //Function for calculating a score
    public static int scoreS(String s){
        //Value at i and i+1 are equal
        if(s.isEmpty())return 0;
        int score=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1))score++;
        }
        return score;
    }
    public static String rotated(String s,int rotations){
        if(rotations==0)return s;
        String next=s.substring(rotations,s.length())+s.substring(0,rotations);
        return next;
    }
    public static int countRotations(String s, int k) {
        int sum=0;
        int count=0;
        //Iterate till k rotations and calculate score then add and return
        for(int i=0;i<s.length();i++){
            String current=rotated(s,i);
            int score=scoreS(current);
            if(score==k)count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countRotations("aab",1));
    }
}
