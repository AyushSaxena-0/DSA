public class O62HOTS1_Leetcode_410_Split_Array_Largest_Sum {
    //Minimum answer is maximum element in array
    //Max answer is sum of all elements in Array
    //The answer is in range [max,sum of elements]
    //apply binary search and count +1 if sum exceeds the mid value
    //Taking first example
    //Range=[10,32]
    //mid=(10+32)/2=21
    // [7,2,5,8,10]
    // if (pieces<=m) end=mid
    public static int max(int[] nums){
        int max=Integer.MIN_VALUE;
        for(int i :nums){
            if(max<i){
                max=i;
            }
        }
        return max;
    }

    public static int sum(int[]nums){
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        return sum;
    }

    public static int splitArray(int[] nums, int k) {
        int start=max(nums);
        int end=sum(nums);

        //Note we are not using equal to as end in the last would give end=start which is the ans
        while(start<end){
            int mid=start+(end-start)/2;
            int count=1;
            int sum=0;


            for(int num :nums){
                if(sum+num>mid){
                    //You cannot add this in subarray , make new one
                    //Say you can add this num in new subarray,then sum=num
                    sum=num;
                    count++;
                }
                else{
                    sum+=num;

                }
            }

            if(count>k){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return end;
    }

    public static void main(String[] args) {
        int[] nums ={7,2,5,10,8};
        int k=2;
        System.out.println(splitArray(nums,k));

    }

}
