public class O274Leetcode_476_Number_Compliment {
    public static int findComplement(int num) {
        int temp=num;
        int mask=0;
        //For example num= 1 1 0
        //A mask is just a binary pattern created for a specific purpose. Its value changes depending on the operation you want to perform.
        //Mask would be=   1 1 1
        while(temp>0){
            mask=(mask<<1)|1;
            temp=temp>>1;
        }
        return (~num)&mask;
    }

    static void main() {
        System.out.println(findComplement(5));
    }
}
