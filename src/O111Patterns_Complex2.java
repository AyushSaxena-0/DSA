public class O111Patterns_Complex2 {
    static void spT(int rows){
        for(int row=1;row<=rows;row++){
            for(int col=1;col<=rows-row;col++){
                System.out.print(" ");
            }
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    static void spT2(int rows){
        for(int row=1;row<=rows;row++){
            for(int col=1;col<=rows-row+1;col++){
                System.out.print("*");
            }
            for(int col=1;col<=row;col++){
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        spT(5);
        System.out.println();
        spT2(5);
    }
}
