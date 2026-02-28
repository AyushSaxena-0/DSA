import java.util.*;
public class O38Dynamic_Arrays_ArrayLists {
    public static void main(String[] args) {
        //Dynamic arrays are known by name of arraylist in java
        //They are known by the name of vector in c++
        //Python lists are dynamic arrays
        //ArrayList is a part of collection framework in java
        //It is made to solve fixed size problem of standard arrays
        ArrayList<Integer> list=new ArrayList<>(10);//10 is initial capacity
        //On right hand side writing new ArrayList<integer>(); is optional
        //Insert to Arraylist by list.add(number); or list.add(index,number);
        //Print an Arraylist by using list.get(index);
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<4;i++){
            list.add(sc.nextInt());
        }
       // System.out.println(list);//prints entire list
        list.add(0,99);//It adds 99 at 0th index and shifts all elements to right doesnt overwrite on 0th index element
        list.set(1,98);//It overwrites the element and doesn't shift array by right
        list.remove(3);//Removes element at 3rd index and shifts elements to left on the right hand side of the element removed
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        //Check if the list contains the specific int/string/float etc.
        System.out.println(list.contains(23));//Checks if list contains 23
        Integer[] arr= list.toArray(new Integer[0]);//stores the element of Arraylist to array
        //We use wrapper class to build array
        System.out.println(Arrays.toString(arr));
        Collections.reverse(list);//It is used to reverse the array list
        System.out.println(list);
        int x=list.removeLast();
        int y=list.removeFirst();
        System.out.println(x);
        System.out.println(y);
    }

}
