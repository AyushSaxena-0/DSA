package OOPS.Lecture_6.Generics;

import java.util.Arrays;

public class CustomGenericArrayList<T> {

    // We are going to create an arraylist
    // How does an arrayList works?
    // It creates an array of default size 10
    // When the array is full then it creates another array of twice the size i.e 20 in this case
    // Then all elements of previous arraylist gets copied in it this process is repeated till needed
    // Since the size doubles thus average time complexity comes out top be O(1)
    // We would do add, remove, size, get, get at index by our custom arraylist

    private Object[] data;
    private int size;
    public static int DEFAULT_SIZE = 10;

    public CustomGenericArrayList() {
        this.data = new Object[DEFAULT_SIZE]; //You cannot do new T[DEFAUL_SIZE]
    }

    // add method
    public void add(int value) {
        if (size == data.length) {

            // Create new array of size 2*DEFAULT_CAPACITY
            Object[] arr = new Object[DEFAULT_SIZE * 2];

            for (int i = 0; i < DEFAULT_SIZE; i++) {
                arr[i] = data[i];
            }

            data = arr;
            DEFAULT_SIZE = 2 * DEFAULT_SIZE;
        }

        data[size] = value;

        // Moving ahead
        size++;
    }

    public void printlist() {
        for (int i = 0; i < size; i++) {

            if (i == 0)
                System.out.print("[");

            if (i == size - 1) {
                System.out.print(data[i] + "]");
                return;
            }

            System.out.print(data[i] + ",");
        }
    }

    public void removeLast() {
        if (size == 0)
            return;

        size--;
    }

    public void removeIndex(int index) {
        if (size == 0)
            return;

        // Remove element at ith index and shift all one by left
        while (index < size - 1) {
            data[index] = data[index + 1];
            index++;
        }

        size--;
    }

    public int listSize() {
        return this.size;
    }

    public T get(int index) {
        return (T)data[index];
    }

    @Override
    public String toString() {
        return "CustomArrayList"+Arrays.toString(data);
    }

    public static void main(String[] args) {

        CustomGenericArrayList list = new CustomGenericArrayList();

        for (int i = 0; i < 20; i++) {
            list.add(2 * i);
        }

        list.removeLast();
        list.removeIndex(2);
        list.printlist();
        System.out.println();
        System.out.println(list.listSize());
        System.out.println(list.get(list.listSize() - 1));
        System.out.println(list);
        list.printlist();
    }
}