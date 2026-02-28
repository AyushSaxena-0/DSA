public class O28Scope_Defined_Again {
    public static void main(String[] args) {
    int a=1000;
        for(int i=0;i<10;i++){
            System.out.println(i);
            //i is accessible only inside this loop
            a=1000000;
        }
        System.out.println(a);
        //i is not accessible outside here

    }

}
