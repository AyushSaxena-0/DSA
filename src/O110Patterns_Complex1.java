public class O110Patterns_Complex1 {
    static void cp1(int rows){
        //When rows are even
        //make right triangle with rows/2
        //Then make inverted right triangle remaining rows/2
        if(rows%2==0){
            for(int row=1;row<=rows;row++){
                //Upper Triangle
                if(row<=rows/2){
                    for(int col=1;col<=row;col++){
                        System.out.print("*");
                }
                    System.out.println();
            }   //Lower Triangle
                else{
                    for(int col=1;col<=rows-row+1;col++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }
        else{
            //When rows are odd then row are rows/2+1 in upper triangle
            //In lower trangle rows/2
            for(int row=1;row<=rows;row++){
                if(row<=rows/2+1){
                    for(int col=1;col<=row;col++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                else{
                    for(int col=1;col<=rows-row+1;col++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }

        }
    }
//Alternative use mid=(rows+1)/2
//This would fix both even and odd case as both have same logic
//if rows=9 mid becomes 5
//if rows=8 mid becomes 4
//works for both
    public static void main(String[] args) {
        cp1(9);
        cp1(10);
    }
}
