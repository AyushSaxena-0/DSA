import java.util.ArrayList;

public class O209Subset_Integer_Array_ArrayList {
    //Time Complexity is
    //O(N*2^N)
    //Space Complexity
    //O(N*2^N)
    public static ArrayList<ArrayList<Integer>>subIn(int[]arr){
        ArrayList<ArrayList<Integer>>outer=new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int num:arr){
            int curS=outer.size();
            for(int i=0;i<curS;i++){
                ArrayList<Integer>temp=new ArrayList<>(outer.get(i));
                temp.add(num);
                outer.add(temp);
            }
        }
        return outer;
    }

    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        System.out.println(subIn(arr));
        //Alternative way to print
        ArrayList<ArrayList<Integer>>list=subIn(arr);
        //In this way you can print each arraylist
        for(ArrayList<Integer>list1:list){
            System.out.println(list1);
        }
    }
}
