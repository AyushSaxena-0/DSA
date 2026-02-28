import java.util.Arrays;

public class O45Linear_Search_Strings {
    static int search_first_occurance(String s,char key){
        if(s==null||s.length()==0) return -1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==key){
                return i;
            }
        }
    return -1;
    }
    static void print_all_occurences(String s,char key){
        if(s==null||s.length()==0) return ;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==key){
                System.out.println("Index "+i);
            }
        }
    }
    static int print_occur_times(String s,char key){
        if(s==null||s.length()==0) return -1;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==key){
                count++;
            }
        }
        return count;
    }
    static int linear_int_range(String s, char key, int start, int end) {
        if (s == null || s.length() == 0) return -1;

        if (start < 0) start = 0;
        if (end >= s.length()) end = s.length() - 1;
        if (start > end) return -1;

        for (int i = start; i <= end; i++) {
            if (s.charAt(i) == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
    String s="Hello World!";
    System.out.println(search_first_occurance(s,'o'));
    print_all_occurences(s,'o');
    System.out.println(print_occur_times(s,'o'));
    System.out.println("First occurance in range at : "+linear_int_range(s,'o',0,s.length()-1));

        //Fun fact convert string to char array by using str.toCharArray()

        System.out.println(Arrays.toString(s.toCharArray()));
    }
}
