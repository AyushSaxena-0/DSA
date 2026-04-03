import java.util.Arrays;

public class O177Leetcode_88_Merge_Sorted_Array {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[]ans=new int[nums1.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                ans[k]=nums1[i];
                k++;
                i++;
            }
            else{
                ans[k]=nums2[j];
                k++;
                j++;
            }
        }
        while(i<m){
            ans[k]=nums1[i];
            i++;
            k++;
        }
        while(j<n){
            ans[k]=nums2[j];
            k++;
            j++;
        }
        System.arraycopy(ans,0,nums1,0,ans.length);
    }

    public static void main(String[] args) {
        int[]nums1={1,2,3,4,5,6,0,0,0,0,0};
        int[]nums2={7,8,9,10,11};
        merge(nums1,6,nums2,5);
        System.out.println(Arrays.toString(nums1));
    }
}
