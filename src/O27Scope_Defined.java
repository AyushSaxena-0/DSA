public class O27Scope_Defined {
    public static void main(String[] args) {

        int a=10;
        int b=20;

        {
            //Once a variable is initialised it cannot be initialised again in same scope
            //int a=55; will give error
            a=55;// is valid (reassignment of value)
            int x=10;
            //Values initialised in block will remain in block
        }
        int x=2567;
        //Note value of x is initialised as it is outside of scope so it is valid
        System.out.println(a);//a would be printed as 55 as it is reassigned
    }
}
