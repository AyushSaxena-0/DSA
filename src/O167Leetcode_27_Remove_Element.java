public class O167Leetcode_27_Remove_Element {
    public static int removeElement(int[] nums, int val) {
        int i=0;
        int last=nums.length-1;

        while(i<=last){
            if(nums[i]==val){
                int temp=nums[i];
                nums[i]=nums[last];
                nums[last]=temp;
                last--;
            }
            else{
                i++;
            }
        }
        return last+1;
    }

    public static void main(String[] args) {
        int[]nums={1,2,3,4,5,5,5,5,5};
        int val=5;
        System.out.println(removeElement(nums,val));
    }
}

