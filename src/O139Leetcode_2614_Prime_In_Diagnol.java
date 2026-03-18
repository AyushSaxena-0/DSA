import java.util.*;
public class O139Leetcode_2614_Prime_In_Diagnol {
    public static boolean optimum(int n){
        if(n<=1)return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static int maxele(ArrayList<Integer> list){
        if(list.size()<=0)return 0;
        int max=list.get(0);
        for(int i=1;i<list.size();i++){
            if(list.get(i)>max){
                max=list.get(i);
            }
        }
        return max;
    }
    public static int diagonalPrime(int[][] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int n=nums[i][i];
            if(optimum(n)==true){
                list.add(n);
            }
            n=nums[i][nums.length-1-i];
            if(optimum(n)==true){//Alter if(optimum(n))
                list.add(n);
            }
        }
        return maxele(list);
    }

    public static void main(String[] args) {
        int[][]matrix={{1,2,3},{5,6,7},{9,10,11}};
        System.out.println(diagonalPrime(matrix));
    }
}
