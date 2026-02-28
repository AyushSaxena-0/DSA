public class O46Minimum_Number {

    static int Min_Number(int []arr){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,78,9};
        System.out.println(Min_Number(arr));

    }

}
