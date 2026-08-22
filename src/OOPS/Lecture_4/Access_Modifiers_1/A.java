package OOPS.Lecture_4.Access_Modifiers_1;

/* Access modifier table

              | Class | Package | Subclass      | Subclass       | World
              |       |         | (same pkg)    | (diff pkg)     | (diff pkg & not subclass)
------------------------------------------------------------------------------------------------
public        |   +   |    +    |      +        |      +         |        +
protected     |   +   |    +    |      +        |      +         |
no modifier   |   +   |    +    |      +        |                |
private       |   +   |         |               |                |

     */

public class A {
    private int num;
    protected int pro=10;
    public int pub=11;
    int def=12; //No access specifier means default
    String name;
    int[] arr;

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
    //Why getter and setter works because private variable can be accessed in the only class itself and not outside
    //But getter and setter methods can access these variables as they are in same class with them
    //And we make getter and setter as public hence they can be accessed indirectly by getter and setter methods in other classes as well due to public access modifier of these methods
    public int getNum(){
        return num;
    }
    public void setNum(int num){
        this.num=num;
    }
}
