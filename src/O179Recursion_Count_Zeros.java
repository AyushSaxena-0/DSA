public class O179Recursion_Count_Zeros {
    static int fun(int n,int count){
        if(n==0){
            return count;
        }
        if(n%10==0){
                return fun(n/10,count+1);
            }
        else{
            return fun(n/10,count);
        }
    }

    public static void main(String[] args) {
        System.out.println(fun(10000,0));
    }
}
