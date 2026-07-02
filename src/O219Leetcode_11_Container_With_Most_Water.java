public class O219Leetcode_11_Container_With_Most_Water {
    public static int maxArea(int[] height) {
        //I am using two pointer approach here
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        //Stopping condition is left<right as they would otherwise repeat the already checked
        //set of pointer
        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, area);
            //Whichever pointer is shorter in height array i am moving that
            if (height[left] < height[right]) {
                //Increment left if it is shorter in height
                left++;
            } else {
                //Otherwise move right towards left
                right--;
            }
        }

        return maxArea;
    }

    static void main() {
        int[]height = new int[] {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height));
    }
}
