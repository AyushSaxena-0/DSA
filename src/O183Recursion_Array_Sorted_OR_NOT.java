public class O183Recursion_Array_Sorted_OR_NOT {

    static boolean helper(int[]arr,int index){
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1]&&helper(arr,index+1);
    }
    static boolean isSorted(int[]arr){
        return helper(arr,0);
    }

    public static void main(String[] args) {
        int[]arr = {1,2,3,6,5};
        System.out.println(isSorted(arr));
    }
}
