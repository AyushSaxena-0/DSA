public class O163Leetcode_12_Integer_To_Roman {
    //ans.append("CM"); // ✅
    //ans.append('CM'); // ❌ INVALID
    //Where ans is a StringBuilder type object
    public static String intToRoman(int n) {
        StringBuilder ans = new StringBuilder();

        while(n > 0){
            if(n >= 1000){
                ans.append("M");
                n -= 1000;
            }
            else if(n >= 900){
                ans.append("CM");
                n -= 900;
            }
            else if(n >= 500){
                ans.append("D");
                n -= 500;
            }
            else if(n >= 400){
                ans.append("CD");
                n -= 400;
            }
            else if(n >= 100){
                ans.append("C");
                n -= 100;
            }
            else if(n >= 90){
                ans.append("XC");
                n -= 90;
            }
            else if(n >= 50){
                ans.append("L");
                n -= 50;
            }
            else if(n >= 40){
                ans.append("XL");
                n -= 40;
            }
            else if(n >= 10){
                ans.append("X");
                n -= 10;
            }
            else if(n >= 9){
                ans.append("IX");
                n -= 9;
            }
            else if(n >= 5){
                ans.append("V");
                n -= 5;
            }
            else if(n >= 4){
                ans.append("IV");
                n -= 4;
            }
            else{
                ans.append("I");
                n -= 1;
            }
        }
        return ans.toString();
    }
/*
   ------ ALTER -------------
public String intToRoman(int num) {
        StringBuilder s=new StringBuilder();
        if(num/1000>=1){
            for(int i=0;i<num/1000;i++){
                s.append("M");
            }
            num=num%1000;
        }
        if(num/900>0){
            s.append("CM");
            num=num%900;
        }
        if(num/500>0){
            s.append("D");
            num=num%500;
        }
        if(num/400>0){
            s.append("CD");
            num=num%400;
        }
        if(num/100>0){
            for(int i=0;i<num/100;i++){
                s.append("C");
            }
            num=num%100;
        }
        if(num/90>0){
            s.append("XC");
            num=num%90;
        }
        if(num/50>0){
            s.append("L");
            num=num%50;
        }
        if(num/40>0){
            s.append("XL");
            num=num%40;
        }
        if(num/10>0){
            for(int i=0;i<num/10;i++){
                s.append("X");
            }
            num=num%10;
        }
        if(num/9>0){
            s.append("IX");
            num=num%9;
        }
        if(num/5>0){
            s.append("V");
            num=num%5;
        }
        if(num/4>0){
            s.append("IV");
            num=num%4;
        }
        if(num/1>0){
            for(int i=0;i<num/1;i++){
                s.append("I");
            }
            num=num%1;
        }
        return s.toString();
    }
 */
    public static void main(String[] args) {
        System.out.println(intToRoman(3999));
    }
}
