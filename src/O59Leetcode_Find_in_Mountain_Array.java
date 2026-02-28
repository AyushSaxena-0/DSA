public class O59Leetcode_Find_in_Mountain_Array {

    // STEP 1: Find peak index
    private static int findPeak(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            // Rising slope → peak on right
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }
            // Falling slope → peak on left or mid
            else {
                end = mid;
            }
        }
        return start; // peak index
    }

    // STEP 2: Order-agnostic binary search
    private static int binarySearch(int[] arr, int target, int start, int end) {
        boolean ascending = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) return mid;

            if (ascending) {
                if (arr[mid] < target) start = mid + 1;
                else end = mid - 1;
            } else {
                if (arr[mid] < target) end = mid - 1;
                else start = mid + 1;
            }
        }
        return -1;
    }

    // STEP 3: Main logic
    public static int findInMountainArray(int target, int[] arr) {

        int peak = findPeak(arr);

        int left = binarySearch(arr, target, 0, peak);
        if (left != -1) return left;

        return binarySearch(arr, target, peak + 1, arr.length - 1);
    }

    // ENTRY POINT
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 5, 6, 4};
        int target = 6;

        int index = findInMountainArray(target, nums);

        System.out.println("Target index: " + index);
        System.out.println("Target value: " + nums[index]);
    }
}
