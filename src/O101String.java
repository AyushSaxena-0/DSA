public class O101String {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int a =10;
        //String is a datatype
        //It is a class also (starts with capital letter)
        //String object is saved in a special kind of heap memory
        //That special heap memory is known as string pool
        String b="Kunal Kushwaha";
        String c="Kunal Kushwaha";
        //Both b and c are pointing to the same object
        // in memory Kunal Kushwaha
        //If you change one object then other would be changed?
        //No. Because you cannot change strings.
        //Strings are immutable in nature
        //For security reasons
        //If you want to change then create a new object
        System.out.println(b);
        System.out.println(c);


        //Look
        String e="Kunal";
        System.out.println(e);
        //I said you cannot modify,
        //But I have created a new string object
        //Old would be cleared by Garbage collector
        e="Kushwaha";
        System.out.println(e);

    }
}
