package OOPS.Lecture_2.a;

public class Trial {
    public static int arraySum(int[]arr){
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(arraySum(new int[]{1,2,3,4,5,6,7,8,9,10}));
    }
}
