public class O115Patterns_Complex6 {
    static void triangle(int lines){
        for(int row=1;row<=lines;row++){
            for(int space=1;space<=(lines-row);space++){
                System.out.print("  ");
            }
            for(int num=row;num>=1;num--){
                System.out.print(num+" ");
            }
           for(int num=2;num<=row;num++){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
    static void invertedTriangle(int lines){
        for(int row=1;row<=lines;row++){
            for(int space=1;space<=row;space++){
                System.out.print("  ");
            }
            for(int num=lines-row;num>=1;num--){
                System.out.print(num+" ");
            }
            for(int num=2;num<=lines-row;num++){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
    static void invertedTriangle2(int lines){
        for(int row=1;row<=lines;row++){
            for(int space=1;space<row;space++){
                System.out.print("  ");
            }
            for(int num=lines-row+1;num>=1;num--){
                System.out.print(num+" ");
            }
            for(int num=2;num<=lines-row+1;num++){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
    static void dimond(int lines){
        int mid=(lines+1)/2;
        triangle(mid);
        invertedTriangle(lines-mid);
    }
    public static void main(String[] args) {
       triangle(5);
        System.out.println();
       invertedTriangle2(5);
        System.out.println();
        dimond(10);
    }
}
