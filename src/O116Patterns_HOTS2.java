public class O116Patterns_HOTS2 {
//This is Hackerrank's HOTS question
//Remember the trick
    static void printPattern(int n) {
//Look center most repeated would create 2*n rows and columns
// as it would a square Matrix
//However for this pattern we have taken 2*n-1 as given in question

        int size = 2 * n - 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
//Distance from top is row and bottom is size - row
//Distance from left is column and right is right-column
                int top = i;
                int left = j;
                int bottom = size - 1 - i;
                int right = size - 1 - j;
//Note this step
                int min = Math.min(Math.min(top, bottom),
                            Math.min(left, right));

                System.out.print((n - min) + " ");
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            printPattern(4);
        }
    }
    /*
    //This is my method i did in array and printed the array
        public static int[][] tri(int n,int[][] nums,int row,int col){
        int x=nums.length-1;
        if(n==1){
            nums[row][col]=1;
            return nums;
        }
        else{
            for(int i=row;i<=x-row;i++){
                nums[i][col]=n;
                nums[i][x-col]=n;
            }
            for(int i=col;i<=x-col;i++){
                nums[row][i]=n;
                nums[x-row][i]=n;
            }
            return tri(n-1,nums,row+1,col+1);
        }
    }
    public static void main(String[] args) {
        int n=4;
        int row=0;
        int col=0;
        int[][]nums=new int[2*n-1][2*n-1];
        int[][]ans=tri(n,nums,row,col);
        for(int[] a:ans){
            System.out.println(Arrays.toString(a));
        }
        //You can also print the array
    }

     */

