public class O67Leetcode_2769_Max_Achievable_number {
    public static int theMaximumAchievableX(int num, int t) {
        //Max differance between the num and x could be of 2 so we can get num+2*t as max value of x
        return num+t*2;
    }

    public static void main(String[] args) {
        System.out.println(theMaximumAchievableX(7,2));
    }
}
