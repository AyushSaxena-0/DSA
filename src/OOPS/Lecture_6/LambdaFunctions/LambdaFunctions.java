package OOPS.Lecture_6.LambdaFunctions;

import java.util.ArrayList;
import java.util.function.Consumer;

import static java.lang.Integer.sum;

public class LambdaFunctions {
    //Lambda expressions are used to save time
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(i);
        }

        //forEach() takes every element and in the list and apply lambda function on it
        list.forEach(x-> System.out.println(x*2));

        Consumer<Integer> fun=x->System.out.println(x);
        list.forEach(fun);

        Operations operation1=(a, b)->a+b;
        Operations operation2=(a,b)->a*b;
        Operations operation3=(a,b)->a/b;

        System.out.println(operation3.operation(6,2));
        System.out.println(sum(14,16));


        //Different lambda expressions can be stored in the same functional interface
        Operations sum=(a,b)->a+b;
        Operations prod=(a,b)->a*b;
        Operations sub=(a,b)->a-b;

        //Passing the lambda expression as an argument to the operate() method
        LambdaFunctions myCalculator=new LambdaFunctions();

        System.out.println(myCalculator.operate(5,3,sum));
        System.out.println(myCalculator.operate(5,3,prod));
        System.out.println(myCalculator.operate(5,3,sub));
    }

    //The Operations object decides which operation will be performed
    private int operate(int a,int b,Operations op){
        return op.operation(a,b);
    }
}

//Important table for which interface you use and which return type can lambda expression have on it
/*| Functional Interface | Takes        | Returns   | Example                              |
        |----------------------|--------------|-----------|--------------------------------------|
        | Consumer<T>          | 1 argument   | void      | x -> System.out.println(x)           |
        | Function<T, R>       | 1 argument   | R         | x -> x * x                            |
        | Predicate<T>         | 1 argument   | boolean   | x -> x % 2 == 0                       |
        | Supplier<T>          | 0 arguments  | T         | () -> Math.random()                  |
 */
interface Operations {
    int operation(int a,int b);
}