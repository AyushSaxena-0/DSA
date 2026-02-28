public class O42Max_Value_Array {
    static int max(int[]arr){
        int max=arr[0];
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
    public static void main(String[] args){
        //Note you can't use Math.max() here as it takes two elements to find maximum of two Math.max(ele1,ele2)
        int[] arr={1,2,3,4,5,6,789,98765};
        System.out.println(max(arr));


    }
}
