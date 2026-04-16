import java.util.Arrays;

public class O196Recursion_Quick_Sort {

    // Quick Sort
    // Time Complexity:
    // Worst Case: O(N^2)
    // Best/Average Case: O(N log N)
    // In-place algorithm (no extra space except recursion stack)
    // Not stable

    static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    static void quickSort(int[] nums, int start, int end){
        // Base condition: if the array has 0 or 1 element
        if(start >= end) return;

        // Choosing middle element as pivot (value, not index)
        int pivot = nums[(start + end) / 2];

        int s = start;
        int e = end;

        // Partitioning process
        while(s <= e){

            // Move s forward until element >= pivot
            while(nums[s] < pivot){
                s++;
            }

            // Move e backward until element <= pivot
            while(nums[e] > pivot){
                e--;
            }

            // Swap elements that are on the wrong side
            if(s <= e){
                swap(nums, s, e);
                s++;
                e--;
            }
        }

        // Now:
        // start → e : left subarray
        // s → end   : right subarray

        quickSort(nums, start, e);
        quickSort(nums, s, end);
    }

    // Note:
    // In internal libraries, hybrid sorting algorithms are used
    // (e.g., Quick Sort + Merge Sort + Insertion Sort)

    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        quickSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
}

// ---------------- MERGE SORT NOTES ----------------

// Time Complexity:
// Best, Average, Worst Case: O(N log N)

// Not in-place (requires O(N) extra space)
// Stable sorting algorithm

// Preferred for Linked Lists because:
// - No need for extra space (just pointer manipulation)
// - Works efficiently with non-contiguous memory