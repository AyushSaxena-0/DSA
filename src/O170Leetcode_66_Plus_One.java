import java.util.Arrays;

public class O170Leetcode_66_Plus_One {
    public static int[] plusOne(int[] arr) {
        int n=arr.length-1;
        for(int i=n;i>=0;i--){
            if(arr[i]!=9){
                arr[i]=arr[i]+1;
                return arr;
            }
            arr[i]=0;
        }
        //If all are 9 then new array would be created with ans[0]=1
        int[]ans=new int[arr.length+1];//New array will have all zero except first
        ans[0]=1;
        return ans;
    }

    public static void main(String[] args) {
        int[]arr={9,9,9};
        System.out.println(Arrays.toString(plusOne(arr)));
    }
}
