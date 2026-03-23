public class O145Square_Root {
    static int prefSqr(int n){
        //Brute Force
        for(int i=2;i<n;i++){
            if(i*i==n)return i;
        }
        return -1;
    }
    static double optimisedSqrt(int n,int p){//n is number ,p is precision required
        int start=0;
        int end=n;
        double root =0;

        while(start<=end){
            int mid=start+(end-start)/2;
            if((long)mid*mid==n){
                return mid;
            }
            else if((long)mid*mid<n){
                root=mid;
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        double d=0.1;
        for(int i=0;i<p;i++){
            while(root*root<=n){
                root=root+d;
            }
            //since it ran till n>root*root
            //so we need to subtract
            root=root-d;
            d=d/10;
        }
        return root;

    }

    public static void main(String[] args) {
        System.out.println(prefSqr(225));
        System.out.printf("%.2f",optimisedSqrt(40,2));
    }

}