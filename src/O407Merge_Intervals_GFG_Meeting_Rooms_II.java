import java.util.Arrays;

public class O407Merge_Intervals_GFG_Meeting_Rooms_II {
    public static int minMeetingRooms(int[] start, int[] end) {
        //The order of which started and when ended does not matter
        //Just increment rooms when start[i]<end[i]
        //Count maxRooms
        //Reduce room if otherwise and move j
        //Note always move i if start is less end j otherwise
        Arrays.sort(start);
        Arrays.sort(end);

        int count=0;
        int i=0;
        int j=0;
        int maxRooms=0;

        while(i<start.length&&j<end.length){
            if(start[i]<end[j]){
                count++;
                maxRooms=Math.max(count,maxRooms);
                i++;
            }else{
                count--;
                j++;
            }
        }
        return maxRooms;

    }

    public static void main(String[] args) {
        int[] start = {1,3,5};
        int[] end = {2,6};
        System.out.println(minMeetingRooms(start, end));
    }
}
