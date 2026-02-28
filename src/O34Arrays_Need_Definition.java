public class O34Arrays_Need_Definition {
    public static void main(String[] args) {

        //Storing multiple values of same time would otherwise require making a lot of variables
        //integers x1,x2,x3,x4,x5 etc could be stored in int[] arr={}


        //Syntax
        // datatype[] name=new datatype[size];

        int rno1=10;
        int rno2=11;
        int rno3=12;
        int rno4=13;

        //above could be replaced by
        int[] rnos=new int[5];
        //above would create an array however won't do anything
        //You would need to add elements by index and size cant grow
        rnos[0] = 10;
        rnos[1] = 11;
        rnos[2] = 12;
        rnos[3] = 13;
        rnos[4] = 14;
        //Alternative
        int[] rnox={10,11,12,13,14,15};
        //Arrays objects are stored in heap
        //Heap objects are non continuos
        //Dynamic memory allocation
        //Hence array objects in java may not be continuos
        //Index in array start from 0
        //Arrays are mutable
        rnos[0]=45;
        System.out.println(rnos[0]);
        String[] arr=new String[5];
        System.out.println(arr[0]);

        //null is like None in python also
        String[] arr2=new String[10];
        arr2[0]=null;// non primitive could be assigned to null
        int [] arr3=new int[10];
        //arr3[0]=null;//This would raise error as primitives cannot be assigned to null

    }
}
