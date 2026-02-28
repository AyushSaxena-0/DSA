public class O33ArmstrongNumbers {

    static boolean checkArmStrong(int x) {

        int digits = 3;
        int sum = 0;
        int temp = x;

        // Armstrong calculation
        while (temp > 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, digits);
            temp = temp / 10;
        }

        return sum == x;
    }
    public static void main(String[] args) {
        for(int i=100;i<=999;i++){
            if(checkArmStrong(i)){
                System.out.print(i+" ");
            }
        }

    }
}
