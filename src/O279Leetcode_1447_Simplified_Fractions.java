import java.util.ArrayList;
import java.util.List;

public class O279Leetcode_1447_Simplified_Fractions {
    public static int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public static List<String> simplifiedFractions(int n) {
        List<String>ans=new ArrayList<>();
        if(n==1)return ans;
        for(int i=2;i<=n;i++){
            int denominator=i;
            int numerator;
            for(int j=1;j<i;j++){
                //j should start with 1 not 0 as zero is not required in question
                //j should be less than i as other wise fraction would become 1 which is not rerquired in question
                numerator=j;
                int hcf=gcd(denominator,numerator);
                //Any fraction which could be reduced to simpler form will already be in the arraylist as we are starting from numerator 1 and denominator 2
                if(hcf==1){
                    //Add in list by making string
                    String value=numerator+""+"/"+denominator;
                    ans.add(value);
                }
            }
        }
        return ans;
    }

    static void main() {
        System.out.println(simplifiedFractions(4));
    }
}
