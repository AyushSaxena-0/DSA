import java.util.ArrayList;

public class O146Factors_Of_Number {
    //Factors of a number give number % factor=0
    //Optimised approach is checking till sqrt(n)
    static ArrayList<Integer> factors(int n){
        ArrayList<Integer>factors=new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0) {
                //Otherwise would have added 6 two times in 6*6=36
                if (n / i == i) {
                    factors.add(i);
                } else {
                    factors.add(i);
                    factors.add(n / i);
                }
            }
        }
        return factors;
    }
    //If you want sorted make two list and add small factors in list1 and larger factors in list 2
    //then merge both
    static void sortedFactors(int n){
        ArrayList<Integer> factors=new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.print(i+" ");
                if(n/i!=i) {
                    factors.add(n / i);
                }
            }
        }
        for(int i=factors.size()-1;i>=0;i--){
            System.out.print(factors.get(i)+" ");
        }
    }


    public static void main(String[] args) {
        System.out.println(factors(10));
        sortedFactors(10);
    }
}
