import java.util.Arrays;

public class O188Recursion_Selection_Sort {
    static void selSort(int[]arr,int s,int e,int max){
        if(e<=0)return;
        //This is the stopping condition
        //for each pass if s becomes greater than end then swap end with max index element
        if(s>e){
            int temp=arr[max];
            arr[max]=arr[e];
            arr[e]=temp;
            selSort(arr,0,e-1,0);
            return;
        }
        else if(arr[s]>arr[max]){
            max=s;
        }
        selSort(arr,s+1,e,max);
    }

    public static void main(String[] args) {
        int[]arr={6,5,4,3,2,1};
        selSort(arr,0,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
}
