import java.util.Arrays;

public class O330Leetcode_1652_Defuse_the_Bomb {
    public static int sumOfKelements(int[]code,int k,int index){
        if(k==0)return 0;
        int sum=0;
        int n=code.length;
        int times=1;
        if(k>0){
            while(times<=k){
                sum+=code[(index+times)%n];
                times++;
            }
            return sum;
        }
        k=-k;
        while(times<=k){
            //For wrap around when index gets negative
            //Note this trick for wrap around left (index-times+n)%n gives us left wrapped array
            //(index+time)%n gives right wrapped array
            sum+=code[(index-times+n)%n];
            times++;
        }
        return sum;
    }
    public static int[] decrypt(int[] code, int k) {
        int[]ans=new int[code.length];
        for(int i=0;i<code.length;i++){
            ans[i]=sumOfKelements(code,k,i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[]code={5,7,1,4};
        System.out.println(Arrays.toString(decrypt(code, 3)));
    }
}
