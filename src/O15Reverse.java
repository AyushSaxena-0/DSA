public class O15Reverse {
    public static void main(String[] args){
      long number=123456789L;
      //Using String builder and reverse methord
//    String n=Long.toString(number);
//    String reversed=new StringBuilder(n).reverse().toString();
//    long rev_num=Long.parseLong(reversed);
//    System.out.println(rev_num);
        //using logical meathod

        long ans=0L;
        while(number>0){
            ans=ans*10+(number%10);
            number=number/10;
        }
        System.out.println(ans);





    }
}
