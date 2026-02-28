public class O113Patterns_Complex4 {
    static void triangle(int rows) {
        for (int row = 1; row <= rows; row++) {
            //Alter instead of for loops for columns instead use
            //for loops for spaces and stars
            //spaces=1;spaces<=rows-spaces;spaces++
            //star=1;star<=2*rows-1;star++;
            for (int col = 1; col <= rows - row; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            for (int col = 1; col <= row - 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void invertedTriangle(int rows) {
        for (int row = rows; row >= 1; row--) {
            // spaces
            for (int space = 1; space <= rows - row+1; space++) {
                System.out.print(" ");
            }
            // stars
            for (int star = 1; star <= 2 * row - 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void ct5(int rows){
        int half=(rows+1)/2;
        triangle(half);
        invertedTriangle(half-1);
    }

    public static void main(String[] args) {
        ct5(12);
    }
}
