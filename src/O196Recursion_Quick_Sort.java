import java.util.Arrays;

public class O196Recursion_Quick_Sort {
    static void swap(int[]nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    static void quickSort(int[]nums,int start,int end){
       if(start>=end)return;
        //We are storing value of pivot not the index
       int pivot=nums[(start+end)/2];

       int s=start;
       int e=end;

       while(s<=e){
           //Condition is on s and e not start and end
           //so the s and e run till(inclusive) s>e
           while(nums[s]<pivot){
               s++;
           }
           while(nums[e]>pivot){
               e--;
           }
           if(s<=e){
               swap(nums,s,e);
               s++;
               e--;
           }
       }
        //so the s and e run till(inclusive) s>e
        //Hence we use start to e first array
        //s to end as second array
       quickSort(nums,start,e);
       quickSort(nums,s,end);

    }

    public static void main(String[] args) {
        int[]nums={5,4,3,2,1};
        quickSort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
}
