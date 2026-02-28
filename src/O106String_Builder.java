public class O106String_Builder {
    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder();
        for(int i=0;i<26;i++){
            builder.append((char)('A'+i));
        }
        //This will take O(N) time complexity
        builder.deleteCharAt(0);
        builder.reverse();
        builder.insert(1,"Java");


        System.out.println(builder);
    }
}

