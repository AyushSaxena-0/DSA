public class O197Recursion_Skip_A_Character {
    public static String skip(String orignal,String ans,int index){
        if(index==orignal.length()){
            return ans;
        }
        if(orignal.charAt(index)=='a'){
            return skip(orignal,ans,index+1);
        }
        else{
            ans=ans+""+orignal.charAt(index);
            return skip(orignal,ans,index+1);
        }
    }
    //It uses a single variable
    public static String skip2(String str){
        if(str.isEmpty()){
            return str;
        }
        if(str.charAt(0)=='a'){
            return skip2(str.substring(1));
        }
        else{
            return str.charAt(0)+skip2(str.substring(1));
        }
    }
    //Alter Use substring for ans
    public static String skipApple(String str){
        if(str.isEmpty()){
            return str;
        }
        if(str.startsWith("apple")){
            return skipApple(str.substring(5));
        }
        else{
            return str.charAt(0)+skipApple(str.substring(1));
        }
    }
    public static String skipAppleButnotapp(String str){
        if(str.isEmpty()){
            return str;
        }
        if(str.startsWith("apple")){
            return "apple"+skipAppleButnotapp(str.substring(5));
        }
        if(str.startsWith("app")){
            return skipAppleButnotapp(str.substring(3));
        }
        else{
            return str.charAt(0)+skipAppleButnotapp(str.substring(1));
        }
    }
    public static void main(String[] args) {
        String orignal="baccad";
        String ans=skip(orignal,"",0);
        System.out.println(ans);
        System.out.println(skip2(orignal));
        System.out.println(skipApple("appleAyush"));
        System.out.println(skipAppleButnotapp("appleappAyush"));
    }
}
