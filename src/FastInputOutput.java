import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FastInputOutput {
    public static void main(String[] args) throws IOException {
        //Scanner class takes data in small chunks so it takes large time in very large amount of parameters like 1,00,000
        //BufferedReader class takes fast input as it takes entire stream of letter
        //BufferedReader stores the entire line into the memory known as Buffer
        //BufferedReader takes standard input, convert it to characters, buffer it, and give me a convenient way to read
        //10 20 30 40 50
        //BufferedReader says Give me the next line.
        //Scanner says Give me the next integer.
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //Now storing these as Strings in array as it is simpler than directly converting into integer
        String[]stringArray=br.readLine().split(" ");
        int[]arr=new int[stringArray.length];
        for(int i=0;i<stringArray.length;i++){
            arr[i]=Integer.parseInt(stringArray[i]);
            System.out.println(arr[i]);
        }

    }
}
