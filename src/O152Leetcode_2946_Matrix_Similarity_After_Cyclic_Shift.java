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

    public static void main(String[] args) {
        int[][]mat = {{1,2,3},{4,5,6},{7,8,9}};
        int k = 4;
        System.out.println((areSimilar(mat,4)));
    }
}
