package OOPS.Lecture_6.ExceptionHandling;

public class Main {
    //Error:- Error is caused due to lack of resources

    /*
        OutOfMemoryError
        StackOverflowError
        VirtualMachineError
     */

    //Error is non-recoverable
    //Program cannot handle it
    //You cannot write code to handle error

    //Exception :-Exception prevents the normal flow of the program
    /*
        ArithmeticException
        NullPointerException
        ArrayIndexOutOfBoundsException
        IOException
     */
    //You can write program to handle it
    public static void main(String[] args) {
    //Exception at compile time is known as checked exception
        // Example reading file from location not available would give checked exception named as FileNotFoundException
    //Exception at runtime are known as Runtime or unchecked exception
        //Example NullPointerException
        int a=2;
        int b=0;
        //Note you need to add specific exceptions on top otherwise general exception would catch them before and code won't go in that catch block
        try {//mimicking
            //throw new exception("Just for fun);

            String name="Kunal";
            if(name.equals("Kunal")){
                throw new MyException("My name is "+name);
            }
            int c = a / b;
        }catch(MyException e){
            System.out.println(e.getMessage());
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println("This is a normal exception");
        }
        finally{//Finally always run whether there is an exception or not
            //Finally can only work if try block is present
            //It can work without catch block but not try block
            //There can only be one finally for a single try catch block
            System.out.println("This will run always whether exception is thrown or not");
        }
        divide(a,b);
    }//throws declares that the function may throw an exception
    //throw actually throw an exception
    static int divide(int a,int b)throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("Please do not divide by zero");
        }
        return a/b;
    }
}
/*
                    Throwable
                       │
             ┌─────────┴─────────┐
             ▼                   ▼
           Error             Exception
                                 │
                    ┌────────────┴────────────┐
                    ▼                         ▼
             Checked Exception        Unchecked Exception
                                      (RuntimeException)
                    │                         │
             IOException              NullPointerException
             SQLException             ArithmeticException
             ClassNotFoundException   ArrayIndexOutOfBoundsException
             FileNotFoundException    NumberFormatException
 */