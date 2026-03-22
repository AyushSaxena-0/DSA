public class O144Sieve_Of_Eratosthenes {
    //This problem have number from 1 to n and we have to find the number of prime numbers
    //in this range
    //So we check till square root n and every prime till sqrt n we also
    //set arr[i] as 0 and its multiples as 0
    //Since multiples of prime
    //We consider every number as prime till sqrt(n)
    //Then we mark all the multiples of those as true as not prime
    //Then printing only false which are prime
    //False --> Means prime
    //Time Complexity is (N*log(log N))
    static void sieve(boolean[]prime,int n){
        for(int i=2;i*i<=n;i++){
            if(!prime[i]){
                for(int j=2*i;j<=n;j=j+i){
                    prime[j]=true;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(!prime[i]){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        int n=50;
        boolean[]prime=new boolean[n+1]; //size n would create array till n-1 from 0
        sieve(prime,n);
    }
}
