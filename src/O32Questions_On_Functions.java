import java.util.Scanner;

public class O32Questions_On_Functions {

    static boolean checkPrime(int x) {
        if (x <= 1) return false;

        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    static boolean checkArmStrong(int x) {

        int original = x;
        int digits = 0;
        int sum = 0;

        // Count digits
        int temp = x;
        while (temp > 0) {
            temp = temp / 10;
            digits++;
        }

        // Armstrong calculation
        temp = x;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp = temp / 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.println("Prime: " + checkPrime(x));
        System.out.println("Armstrong: " + checkArmStrong(x));
    }
}
