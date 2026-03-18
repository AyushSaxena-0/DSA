import java.util.Arrays;

public class O137Leetcode_832_Flipping_Image {
    public static void swap(int[][] arr, int row, int c1, int c2) {
        int temp = arr[row][c1];
        arr[row][c1] = arr[row][c2];
        arr[row][c2] = temp;
    }

    public static void reverse(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int start = 0;
            int end = arr[i].length - 1;
            while (start < end) {
                swap(arr, i, start, end);
                start++;
                end--;
            }
        }
    }

    static int[][] optimum(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < (arr[i].length + 1) / 2; j++) {
                int temp = arr[i][j] ^ 1;
                arr[i][j] = arr[i][arr[i].length - j - 1] ^ 1;
                arr[i][arr[i].length - j - 1] = temp;
            }
        }
        return arr;
    }

    public static void invert(int[][] arr) {
        //Alter use XOR to do invert the bit
        // 0 ^ 1= 1
        // 1 ^ 1= 0
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == 0) {
                    arr[row][col] = 1;
                } else {
                    arr[row][col] = 0;
                }
            }
        }
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        reverse(image);
        invert(image);
        return image;
    }

    public static void main(String[] args) {
        int[][] image = {{1, 1, 0}, {0, 1, 1}, {1, 0, 0}};

        int[][] image2 = new int[image.length][];
        for (int row = 0; row < image.length; row++) {
            image2[row] = image[row].clone();
        }

        System.out.println(Arrays.deepToString(flipAndInvertImage(image)));
        System.out.println(Arrays.deepToString(optimum(image2)));
    }
}