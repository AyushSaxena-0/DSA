import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class O201Leetcode_349_Intersection_Of_Two_Arrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        //I created two hashsets one to add all elements in nums1
        Set<Integer> setA=new HashSet<>();
        //While iterating through nums2,I check if setA contains it
        //If setA contains it then add it in answer
        Set<Integer>ans=new HashSet<>();

        for(int num:nums1){
            setA.add(num);
        }
        for(int num:nums2){
            if(setA.contains(num)){
                ans.add(num);
            }
        }
        //Create a new array and add elements of set
        int[]arr=new int[ans.size()];
        int i=0;
        for(int num:ans){
            arr[i++]=num;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[]nums1={1,2,3,4,4,5,6};
        int[]nums2={5,6,4};
        System.out.println(Arrays.toString(intersection(nums1,nums2)));
    }
}
