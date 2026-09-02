public class O323Leetcode_67_Add_Binary {
    public static String addBinary(String a, String b) {
        int p1=a.length()-1;
        int p2=b.length()-1;
        StringBuilder sb=new StringBuilder();
        int carry=0;
        while(p1>=0&&p2>=0){
            char cha=a.charAt(p1);
            char chb=b.charAt(p2);
            if(((cha=='1'&&chb=='0')&&(carry==0))||(cha=='0'&&chb=='1')&&(carry==0)){
                sb.append('1');
                p1--;
                p2--;
            }
            else if((cha=='0'&&chb=='0')&&(carry==0)){
                sb.append('0');
                p1--;
                p2--;
            }
            else if(((cha=='1'&&chb=='0')&&(carry==1))||(cha=='0'&&chb=='1')&&(carry==1)){
                sb.append(0);
                p1--;
                p2--;
            }
            else if((cha=='0'&&chb=='0')&&(carry==1)){
                sb.append('1');
                carry=0;
                p1--;
                p2--;
            }
            else if((cha=='1'&&chb=='1')&&(carry==0)){
                sb.append('0');
                carry=1;
                p1--;
                p2--;
            }
            else if((cha=='1'&&chb=='1')&&(carry==1)){
                sb.append('1');
                carry=1;
                p1--;
                p2--;
            }
        }
        while((p2>=0)){
            if((carry==1)&&b.charAt(p2)=='0'){
                sb.append('1');
                carry=0;
                p2--;
            }
            else if((carry==0)&&b.charAt(p2)=='0'){
                sb.append('0');
                p2--;
            }
            else if((carry==1)&&b.charAt(p2)=='1'){
                sb.append('0');
                carry=1;
                p2--;
            }
            else{
                sb.append('1');
                carry=0;
                p2--;
            }
        }
        while((p1>=0)){
            if((carry==1)&&a.charAt(p1)=='0'){
                sb.append('1');
                carry=0;
                p1--;
            }
            else if((carry==0)&&a.charAt(p1)=='0'){
                sb.append('0');
                p1--;
            }
            else if((carry==1)&&a.charAt(p1)=='1'){
                sb.append('0');
                carry=1;
                p1--;
            }
            else{
                sb.append('1');
                carry=0;
                p1--;
            }
        }
        if(carry==1)sb.append('1');
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));
    }
}
