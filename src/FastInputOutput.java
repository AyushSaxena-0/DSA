import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FastInputOutput {
    public static void main(String[] args) throws IOException {

        // Scanner is convenient, but it has more overhead and can be slower
        // when there is a very large amount of input, like 1,00,000 values.

        // BufferedReader uses a buffer to read input efficiently.
        // It reads input in larger chunks instead of processing every small piece individually.

        // BufferedReader takes standard input, converts it into characters,
        // buffers the input, and provides convenient methods to read it.

        // Example input:
        // 10 20 30 40 50

        // BufferedReader says: "Give me the next line."
        // Scanner says: "Give me the next integer."

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // br.readLine() always returns the input line as a String.
        // Here, we are storing the first line as a String.
        String s = br.readLine();

        // readLine() gives the complete line as a String.
        // split(" ") separates the String wherever there is a space.
        // Example:
        // "10 20 30 40 50"
        //       ↓ split(" ")
        // ["10", "20", "30", "40", "50"]
        String[] stringArray = br.readLine().split(" ");

        // Now converting the String values into integers
        // and storing them in an int array.
        int[] arr = new int[stringArray.length];

        for (int i = 0; i < stringArray.length; i++) {

            // Integer.parseInt() converts String → int.
            arr[i] = Integer.parseInt(stringArray[i]);

            System.out.println(arr[i]);
        }

        // Reading another complete line as a String.
        String s2 = br.readLine();

        // toCharArray() converts String → char[].
        char[] letters = s2.toCharArray();

        System.out.println(Arrays.toString(letters));
    }
}