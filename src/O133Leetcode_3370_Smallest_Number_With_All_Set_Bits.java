public class O133Leetcode_3370_Smallest_Number_With_All_Set_Bits {
    public static int smallestNumber(int n) {
        int count=0;
        int temp=n;
        while(temp>0){
            temp=temp>>1;
            count++;
        }
        return (1<<count)-1;//It is the mask 1000-1=111
    }

    public static void main(String[] args) {
        System.out.println(smallestNumber(10));
    }
}
