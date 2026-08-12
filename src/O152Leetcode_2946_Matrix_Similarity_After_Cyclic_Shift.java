import java.util.*;
public class O152Leetcode_2946_Matrix_Similarity_After_Cyclic_Shift {
    static boolean areSimilar(int[][] mat, int k) {
        //This is simple
        //Creating a copy
        int[][]arr=new int[mat.length][mat[0].length];
        for(int i=0;i<mat.length;i++){
            arr[i]=mat[i].clone();
        }
        k=k%mat[0].length;
        while(k>0){
            for(int i=0;i<mat.length;i++){
                if(i%2==0){
                    //Even indexed are shifted to left
                    int temp=mat[i][0];
                    for(int j=0;j<mat[i].length-1;j++){
                        mat[i][j]=mat[i][j+1];
                        mat[i][j+1]=temp;
                    }
                }
                else{
                    //Odd indexed are shifted to right
                    int temp=mat[i][0];
                    for(int j=0;j<mat[i].length-1;j++){
                        mat[i][j]=mat[i][j+1];
                        mat[i][j+1]=temp;
                    }
                }
            }
            k--;
        }
        return Arrays.deepEquals(arr,mat);
    }
    /*
    public boolean areSimilar(int[][] mat, int k) {
        //Outer for loop running k times
        int[][]test=new int[mat.length][mat[0].length];
        for(int i=0;i<k;i++){
            for(int j=0;j<mat.length;j++){
                for(int l=0;l<mat[j].length;l++){
                    int n=mat[j].length;
                    if(j%2==0){
                        //Shift by one
                        test[j][Math.floorMod(l-k,n)]=mat[j][l];
                     //    Note why
                     //   -1%3=-1
                     //   but -1 mod 3 is equivalent to 2
                     //   Math.floorMod(-1,3)==2
                     //   Hence floor Mod is used
                    }
                    else{
                        test[j][(l+k)%n]=mat[j][l];
                    }
                }
            }
        }
        return Arrays.deepEquals(test,mat);
    }
     */

    public static void main(String[] args) {
        int[][]mat = {{1,2,3},{4,5,6},{7,8,9}};
        int k = 4;
        System.out.println((areSimilar(mat,4)));
    }
}
