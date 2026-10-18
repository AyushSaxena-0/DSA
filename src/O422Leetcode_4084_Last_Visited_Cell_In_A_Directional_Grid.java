import java.util.Arrays;

public class O422Leetcode_4084_Last_Visited_Cell_In_A_Directional_Grid {
    public static int[] lastVisitedCell(char[][] grid) {
        //I need to create a boolean grid which stores my visited or non visited cells
        boolean[][]visited=new boolean[grid.length][grid[0].length];
        //Starting point in the array
        int i=0;
        int j=0;
        //Now iterate in grid
        do{
            visited[i][j]=true;
            //We need to check first if the next index is correct or not so we create temprary ni and nj for i and j
            int ni=i;
            int nj=j;
            if(grid[i][j]=='L'&&j>0){
                //Move j left
                nj--;
            }
            else if(grid[i][j]=='R'&&j<grid[0].length-1){
                //Move j right
                nj++;
            }
            else if(grid[i][j]=='U'&&i>0){
                //Move i upwards
                ni--;
            }
            else if(grid[i][j]=='D'&&i<grid.length-1){
                //Move i downwards
                ni++;
            }
            if(visited[ni][nj]){
                return new int[]{i,j};
            }
            i=ni;
            j=nj;
        }
        while(visited[i][j]!=true);

        return new int[]{i,j};
    }

    public static void main(String[] args) {
        char[][] grid={{'R','D'},{'L','U'}};
        System.out.println(Arrays.toString(lastVisitedCell(grid)));
    }
}
