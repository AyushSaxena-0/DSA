public class O53Leetcode_744_Find_The_Smallest_Number_Greater_Than_Target {
   // https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
    static char ceil(char[]letters,char target) {

            int start = 0;
            int end = letters.length - 1;

            // Edge case: empty array
            if (letters == null || letters.length == 0) {
                return letters[0];
            }

            // If target is greater than the greatest element
        //Alter return start%letters.length
            if (target >= letters[letters.length - 1]) {
                return letters[0];  // ceiling does not exist
            }

            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (letters[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }
            return letters[start];
        }

        public static void main(String[] args) {
            char[] letters={'a','c','d','k','x','y'};
            char target='g';
            System.out.println(ceil(letters,target));
        }

    }




