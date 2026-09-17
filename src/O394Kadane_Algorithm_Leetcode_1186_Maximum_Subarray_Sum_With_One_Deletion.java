public class O394Kadane_Algorithm_Leetcode_1186_Maximum_Subarray_Sum_With_One_Deletion {
    public static int maximumSum(int[] arr) {

        int noDelete=arr[0];
        int oneDelete=0;
        int best=arr[0];

        for(int i=1;i<arr.length;i++){
            //Note in No delte you can only use noDelete as more than one elements cannot be deleted
            int currNoDelete=Math.max(arr[i],noDelete+arr[i]);
            //Also in one delete take max from nodelete,oneDelete+delete[i]
            int currOneDelete=Math.max(noDelete,oneDelete+arr[i]);
            //Choose the maximum answer
            best=Math.max(best,Math.max(currNoDelete,currOneDelete));
            noDelete=currNoDelete;
            oneDelete=currOneDelete;
        }
        return best;
    }

    public static void main(String[] args) {
        int[]arr={-1,0,3,4,-5};
        System.out.println(maximumSum(arr));
    }
}
