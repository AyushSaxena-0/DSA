public class O44Linear_Search {
    //Linear search
    // best case time complexity O(1)
    //Average case time complexity O(N)
    //Worst case time complexity O(N)

    static int searchindex(int[]arr,int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key)return i;
            }
        //We return -1 as there is no -1 index
        return -1;
    }
    static int searchelement(int[] arr,int key){
        for(int i:arr){
            if(i==key) return i;
        }
        return Integer.MAX_VALUE;
    }
    static boolean searchifpresent(int[]arr,int key){
        for(int i:arr){
            if(i==key) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        //Searching refers to finding an element in a Data Structure
        int[] arr={1,2,3,4,5};
        int key=565;
        System.out.println(searchindex(arr,key));
        System.out.println(searchelement(arr,key));
        System.out.println(searchifpresent(arr,key));
    }
}
