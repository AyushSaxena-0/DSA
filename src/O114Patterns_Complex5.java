public class O114Patterns_Complex5 {
    static void triangle(int rows) {
        for (int row = 2; row <= rows; row++) {
            //Alter instead of for loops for columns instead use
            //for loops for spaces and stars
            //spaces=1;spaces<=rows-spaces;spaces++
            //star=1;star<=2*rows-1;star++;
            for (int space = 1; space <= rows - row; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= 2*row-1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void invertedTriangle(int rows) {
        for (int row = rows; row >= 1; row--) {
            // spaces
            for (int space = 1; space <= rows - row; space++) {
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
        invertedTriangle(half);
        triangle(rows-half);
    }

    public static void main(String[] args) {
        ct5(12);
    }
}
