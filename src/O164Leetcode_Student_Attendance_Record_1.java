public class O164Leetcode_Student_Attendance_Record_1 {
    public static boolean absent(String s){
        //For less than 2 days
        int count =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'){
                count++;
            }
        }
        return count<2;
    }
    public static boolean late(String s){
        for(int i=0;i<s.length()-2;i++){
            if(s.charAt(i)=='L'&&s.charAt(i+1)=='L'&&s.charAt(i+2)=='L'){
                return true;
            }
        }
        return false;
    }
    public static boolean checkRecord(String s) {
        return absent(s)&&!late(s);
    }
    //Optimised approach is running both functions as one loop
    public static boolean checkRecordOptimised(String s) {
        int abs = 0;
        int lateStreak = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == 'A') {
                abs++;
                if (abs >= 2) return false;
            }

            if (ch == 'L') {
                lateStreak++;
                if (lateStreak >= 3) return false;
            } else {
                lateStreak = 0; // reset streak
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "PPALLP";
        System.out.println(checkRecord(s));
        System.out.println(checkRecordOptimised(s));
    }
}
