public class O116Patterns_HOTS2 {
//This is Hackerrank's HOTS question
//Remember the trick
    static void printPattern(int n) {
//Look center most repeated would create 2*n rows and columns
// as it would a square Matrix
//However for this pattern we have taken 2*n-1 as given in question

        int size = 2 * n - 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
//Distance from top is row and bottom is size - row
//Distance from left is column and right is right-column
                int top = i;
                int left = j;
                int bottom = size - 1 - i;
                int right = size - 1 - j;
//Note this step
                int min = Math.min(Math.min(top, bottom),
                            Math.min(left, right));

                System.out.print((n - min) + " ");
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            printPattern(4);
        }
    }

