public class O317Leetcode_2904_Shortest_And_Lexicographically_Smallest_And_Beautiful_String {
    public static String shortestBeautifulSubstring(String s, int k) {
        String best="";
        //Run for loop for substring dont try to overcomplicate thing
        //Also continuous substring is required dont do pick and skip as that would make it non continious
        for(int i=0;i<s.length();i++){
            int ones=0;
            for(int j=i;j<s.length();j++){
                if(s.charAt(j)=='1')ones++;
                if(ones==k){
                    String current=s.substring(i,j+1);//Java's substring(i,j) does not include j thus do j+1 as upper limit
                    //Conditions as per the question
                    // Default first case  //Smaller Number      //If length is equal compare lexicographically
                    if(best.equals("")||current.length()<best.length()||(current.length()==best.length()&&current.compareTo(best)<0))best=current;break;
                }
                //Note that in JAVA
                //str1.compareTo(str2) compares string lexicographically
                //"001".compareTo("101") gives a negative number (Less than 0)
                //"101".comparesTo("001") gives positive number (greater than 0)
                //Thus whenever you need to compare two string lexicographically just compare them by this function
            }
        }
        return best;
    }

    public static void main(String[] args) {
        System.out.println(shortestBeautifulSubstring("1000000110",2));
    }
}
