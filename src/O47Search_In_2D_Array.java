import java.util.Arrays;

public class O47Search_In_2D_Array {
    static int[] search(int[][]arr,int target){
        if (arr == null || arr.length == 0) {
            return new int[]{-1, -1};
        }
        for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            if(arr[i][j]==target){
                int[] ans={i,j};
            return ans;
            }
        }
    }
    //Note this syntax of returning new array
    return new int[]{-1,-1};
        //Note while assigning int[][] arr={{},{},{}}; we don't do
        //int[][]arr=new int[][]{{},{},{}}; because it is understood as it is mentioned on left hand side
        //However since nothing is written on L.H.S hence in above case we need to write new int[][]{{},{},{}}; to create an object

    }
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        System.out.println(Arrays.toString(search(arr,12)));


    }
}
