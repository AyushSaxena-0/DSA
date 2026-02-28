public class O105String_Performance {
    public static void main(String[] args) {
     String series="";
     for(int i=0;i<26;i++){
         char ch=(char)('A'+i);
         series=series+ch; //series+=ch is same thing
     }
     //Time complexity would become O(N^2) of adding like this
     //Because as string objects cannot be modified , so it creates a new object of string everytime
     //Which causes [a,ab,abc,abcd,abcde,abcdef.....abcdefghijklmnopqrstuvwxy] objects to stay in memory
     //Thus it creates n(n+1)/2 objects of string
     //Causes O(N^2) time complexity which is inefficient
     //So we use stringbuilder as it allows us to modify the string object created by it
        System.out.println(series);
    }
}
