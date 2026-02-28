import java.util.Arrays;
public class O36Passing_In_Functions {
    static void change(int[] arr){
        arr[0]=2345;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,56,7};
        change(arr);
        //Since the change in array causes change in object reference variable hence we see that a function can alter array as they are objects whose reference variable change
        System.out.println(Arrays.toString(arr));
    }

}
