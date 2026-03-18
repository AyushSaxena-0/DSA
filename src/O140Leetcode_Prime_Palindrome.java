public class O140Leetcode_Prime_Palindrome {
        public static boolean isPrime(int n){
            if(n<=1)return false;
            for(int i=2;i*i<=n;i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }
        /*    public boolean ispallindrome(int n){
                String str=String.valueOf(n);
                int start=0;
                int end=str.length()-1;
                while(start<end){
                    if(str.charAt(start)==str.charAt(end)){
                        start++;
                        end--;
                    }
                    else{
                        return false;
                    }
                }
                return true;
            }

            public int primePalindrome(int n) {
                if((n/10)<1){
                    for(int i=n;i<=200000000;i++){
                        if(isprime(i)){
                            return i;
                        }
                    }
                }
                for(int i=n;i<=200000000;i++){
                    if(ispallindrome(i) && isprime(i))return i;
                }
                return 0;
            }
        }
        This methord is causing TLE Eventhough the logic is correct
        */
        public static int primePalindrome(int n){
            //Since checking is expensive why not we create all the pallindrom sequence
            //Having 9 digits (2*10^8 would have 9 digits)
            //Observe
    /*
    pallindrome of 123(3 digits) is 12321 (5 digits)
    so we can say pallindrome of n digits has 2n-1 digits
    2n-1 = 9 digits (Max given in the question)
    2n=10, n=5 so 999999999 is largest pallindrome possible from 99999
    so we take i<100000
    //Also we are making odd length pallindrome because even length pallindrome except 11 are all divisible by 11
    for divisibllity by 11 we need
    //(Even digits sum)-(Odd digits sum)=0
    which is always true for palindrome with even digits
    */
            // If next prime is one digit so it is already a pallindrome
            if(n<=2)return 2;
            if(n<=3)return 3;
            if(n<=5)return 5;
            if(n<=7)return 7;
            if(n<=11)return 11;
            for(int i=1;i<100000;i++){
                String s=String.valueOf(i);
                String rev=new StringBuilder(s).reverse().toString();
                //Creating a odd digit pallindrome
                int num=Integer.parseInt(s+rev.substring(1));
                //Check condition
                if(num>=n && isPrime(num)){
                    return num;
                }
            }
            return -1;
        }

    public static void main(String[] args) {
        int n=13;
        System.out.println(primePalindrome(n));
    }
    }


