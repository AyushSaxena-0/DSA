import java.util.Arrays;

public class O157Construct_the_Rectangle {
    public static int[] constructRectangle(int area) {
        for (int l = (int)Math.sqrt(area); l > 0; l--) {
            //I really could not think of this easy logic
            //if one variable is found we can just find second one by division
            if (area % l == 0) {
                return new int[]{area / l, l};
            }
        }
        return new int[]{area, 1};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(constructRectangle(10000)));
    }
}
