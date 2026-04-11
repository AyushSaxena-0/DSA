public class O187Recursion_Triangle {
    static void tri1(int row,int col){
        if(row<0)return;
        if(col>=0){
            System.out.print("*");
            tri1(row,col-1);
        }
        if(col<0){
            System.out.println();
            tri1(row-1,row-1);
        }
    }
    //Alter print after recursion
    static void tri3(int row,int col){
        if(row<0)return;
        if(col>=0){
            tri3(row,col-1);
            System.out.print("*");

        }
        if(col<0){
            tri3(row-1,row-1);
            System.out.println();
        }
    }

    static void tri2(int row,int col,int target){
        if(row>target)return;
        if(col<=row){
            System.out.print("*");
            tri2(row,col+1,target);
        }
        else{
            System.out.println();
            tri2(row+1,0,target);
        }
    }
    public static void main(String[] args) {
        tri1(3,3);
        System.out.println();
        tri2(0,0,3);
        System.out.println();
        tri3(3,3);
    }
}
