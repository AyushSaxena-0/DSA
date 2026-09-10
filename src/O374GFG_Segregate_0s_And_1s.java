import java.util.Arrays;

public class O374GFG_Segregate_0s_And_1s {
    //You can solve by using Arrays.sort also
    static void segregate0and1(int[] arr) {
        // code here
        int left=0;
        int right=arr.length-1;

        while(left<right){
            while(left<right){
                if(arr[left]==0)left++;
                else break;
            }
            while(left<right){
                if(arr[right]==1)right--;
                else break;
            }
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[]arr={0,1,0,1,0,1,0,1,0,1,0,0,1,0,1,0,1,1,1};
        segregate0and1(arr);
        System.out.println(Arrays.toString(arr));
    }
}
