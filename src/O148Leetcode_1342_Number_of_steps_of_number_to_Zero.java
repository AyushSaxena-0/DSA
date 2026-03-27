public class O148Leetcode_1342_Number_of_steps_of_number_to_Zero {
    public static int helper(int num,int steps){
        if(num==0)return steps;
        else if(num%2==0)return helper(num/2,steps+1);
        else return helper(num-1,steps+1);

    }
    public static int numberOfSteps(int num) {
        int steps=0;
        return helper(num,steps);
    }

    public static void main(String[] args) {
        int num=41;
        System.out.println(numberOfSteps(num));
    }
}
