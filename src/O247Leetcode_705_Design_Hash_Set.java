import java.util.*;
class MyHashSet {
    //You dont need to make it public, default or private is fine
    //We dont make it static as otherwise on making object all objects would refer to only one list
    //Hence we use only instance variable not static
    List<Integer>list;
    public MyHashSet() {
        list=new ArrayList<>();
    }

    public void add(int key) {
        //Since we are creating a Hashset so Value should not be repeated
        //Hence only insert unique value
        if(!list.contains(key))
            list.add(key);
    }

    public void remove(int key) {
        //Note Array List haas two methords remove by index and remove by object
        //We cant remove by index as key is element itself not index
        //So we use list.remove(object) as object works as a key and not index
        list.remove(Integer.valueOf(key));
    }

    public boolean contains(int key) {
        return list.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
public class O247Leetcode_705_Design_Hash_Set {
    static void main() {
        MyHashSet set1 = new MyHashSet();
        MyHashSet set2 = new MyHashSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(4);
        set2.add(5);

        System.out.println("Set 1 contains 2: " + set1.contains(2));
        System.out.println("Set 1 contains 3: " + set1.contains(3));
        System.out.println("Set 1 contains 4: " + set1.contains(4));
        System.out.println("Set 2 contains 5: " + set2.contains(5));
    }
}
