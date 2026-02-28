public class O52Floor_of_Number {
        static int floor(int[]arr,int target){
            // Floor of a number = greatest number <= target

            int start=0;
            int end=arr.length-1;

            // Edge case: empty array
            if (arr == null || arr.length == 0) {
                return -1;
            }

            // If target is less than the smallest element
            if (target < arr[0]) {
                return -1;  // floor does not exist
            }

            while(start<=end){
                int mid=start+(end-start)/2;
                if(arr[mid]==target){
                    return mid;
                }
                else if(arr[mid]>target){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }

            }
            return end;
        }

        public static void main(String[] args) {
            int[] arr={54,65,98,99,102,185,235,897};
            int target=103;
            System.out.println(floor(arr,target));
        }

    }


