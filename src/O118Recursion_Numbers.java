public class O118Recursion_Numbers {
    //Look this each function is calling another function with parameter n-1
    //Also each function is doing similar thing so we can replace it with just one function
    //All the function calls happen in stack memory
    //While the function is not finished executing it will remain in stack
    //When a function finishes execution the flow of program goes to the calling functions
    //and moves out of the stack
    //Recursion means a function that calls itself

    //To prevent infinite loop of no stopping we need a base condition for stopping the loop
    //Recursion helps us solve complex problems easily
    //You can convert recursion solution to iteration based solutions

    static void message(int n){
        System.out.println(n);
        message2(n-1);
    }
    static void message2(int n){
        System.out.println(n);
        message3(n-1);
    }
    static void message3(int n){
        System.out.println(n);
        message4(n-1);
    }
    static void message4(int n){
        System.out.println(n);
        message5(n-1);
    }
    static void message5(int n){
        System.out.println(n);
    }
    static void messageenhanced(int n){
//        if(n==1){
//            System.out.println(1);
//        }
//        else{
            System.out.println(n);
            messageenhanced(n-1);
//        }

    }

    public static void main(String[] args) {
        message(5);
        messageenhanced(5);
    }
}
