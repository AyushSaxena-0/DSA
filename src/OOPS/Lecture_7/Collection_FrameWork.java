package OOPS.Lecture_7;

import java.util.*;

public class Collection_FrameWork {
    //Do check out the image.png in this folder

    // Collection Framework is a set of classes and interfaces in Java
// that provide predefined data structures such as ArrayList, Stack,
// Queue, HashMap, HashSet, Deque, etc.

// It provides common interfaces and methods that make it easier
// to work with different types of collections.

// For example, many collection classes provide common methods
// such as isEmpty(), size(), add(), remove(), etc.

// Classes that implement the same interface can provide
// similar/common methods.
// For example, ArrayList and LinkedList both implement the List interface,
// so they have common methods such as add(), remove(), and isEmpty().
    //Click alt+click on Collections class in IntelliJ IDEA to check documentations
public static void main(String[] args) {
    //Vector vs ArrayList
// List is non-thread synchronized
// Vector is thread synchronized

// That means Vector's individual methods are synchronized.
// When one thread is executing a synchronized Vector method,
// another thread cannot execute another synchronized Vector method
// on the same Vector object at the same time.
// The second thread has to wait until the first thread releases the lock.

// However, in ArrayList, methods are not synchronized.
// Multiple threads can access the same ArrayList concurrently.
// This makes ArrayList faster in single-threaded applications,
// but it is not thread-safe when multiple threads modify it concurrently.
    List<Integer> list=new ArrayList<>();
    List<Integer>list2=new LinkedList<>();
    List<Integer>vector=new Vector<>();
}
}
/*
Collection
   |
   ├── List
   │    ├── ArrayList
   │    └── LinkedList
   │
   ├── Set
   │    ├── HashSet
   │    └── TreeSet
   │
   └── Queue
        ├── PriorityQueue
        └── Deque
             └── ArrayDeque
 */
/*
Map
 |
 ├── HashMap
 ├── TreeMap
 └── LinkedHashMap
 */