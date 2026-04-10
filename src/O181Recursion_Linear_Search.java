public class O181Recursion_Linear_Search {
    //This function is for first occurrence
    static int helper(int[]arr,int index,int target){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        else{
            return helper(arr,index+1,target);
        }
    }
    static int linearSearch(int[]arr,int target){
        return helper(arr,0,target);
    }

    public static void main(String[] args) {
        int[]arr={5,4,3,1,2,7,8,9};
        System.out.println(linearSearch(arr,9));
    }
}
