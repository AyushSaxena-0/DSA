import java.util.*;

public class O295MazeProblem_All_Path {
    static List<String> allPaths(int[][]maze,String path, int row, int col,boolean[][]visited){
        //I am designing the base case here
        if(row==maze.length-1&&col==maze[0].length-1){
            ArrayList<String>list=new ArrayList<>();
            list.add(path);
            return list;
        }

        if(row>maze.length-1||col>maze[0].length-1){
            return new ArrayList<>();
        }
        ArrayList<String> list=new ArrayList<>();
        //Now moving right
        if(visited[row][col])return new ArrayList<>();
        visited[row][col]=true;
        if(col<maze[0].length-1){
            list.addAll(allPaths(maze,path+"R",row,col+1,visited));
        }
        //Move left
        if(col>0){
            list.addAll(allPaths(maze,path+"L",row,col-1,visited));
        }
        //Move up
        if(row>0){
            list.addAll(allPaths(maze,path+"U",row-1,col,visited));
        }
        //Move down
        if(row<maze.length-1){
            list.addAll(allPaths(maze,path+"D",row+1,col,visited));
        }
        visited[row][col]=false;
        return list;
    }

    public static void main(String[] args) {
        int[][] maze={
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };
        boolean[][]visited=new boolean[maze.length][maze[0].length];

        System.out.println(allPaths(maze,"",0,0,visited));
    }
}
