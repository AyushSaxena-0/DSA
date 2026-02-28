public class O109Patterns_Approach_to_solve_any_pattern_problem {
    //Run the for loop for the number of times equal to lines
    //For every row how many columns are there
    //Type of element each column has
    //Find the formulae for relating rows and columns

    static void triangle(int lines){
     for(int row=1;row<=lines;row++){
         for(int col=1;col<=row;col++){
             System.out.print("*");
         }
         System.out.println();
     }
    }
    static void invertedTriangle(int lines){
        for(int row=1;row<=lines;row++){
            for(int col=1;col<=lines-row+1;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void rectangle(int rows,int columns){
        for(int row=1;row<=rows;row++){
            for(int col=1;col<=columns;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void numberedTriangle(int lines){
        for(int row=1;row<=lines;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        triangle(6);
        System.out.println();
        System.out.println();
        rectangle(6,4);
        System.out.println();
        System.out.println();
        System.out.println();
        rectangle(6,6);
        System.out.println();
        invertedTriangle(6);
        System.out.println();
        numberedTriangle(4);
    }
}
