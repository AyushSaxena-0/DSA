package OOPS.Lecture_4.Packages;

public class ObjectDemo {

    int num;
    float gpa;

    public ObjectDemo(ObjectDemo obj) {
        num = obj.num;
    }

    public ObjectDemo(int num, float gpa) {
        super();
        this.num=num;
        this.gpa=gpa;
    }
    //We will go into details how to create our own hashcode in hashmap lecture okay!
    @Override
    public int hashCode() {
        return super.hashCode();
        //I am creating my own hashcode by overriding
        //return num%10;
    }

    @Override
    public boolean equals(Object obj) {
        return this.num==((ObjectDemo)obj).num;
        //super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
        ObjectDemo objDemo1 = new ObjectDemo(1,9.44f);
        ObjectDemo objDemo2 = new ObjectDemo(1,9.44f);
        //Note Both have same value of num but give different hash value
        ObjectDemo objDemo3 = new ObjectDemo(100,10f);
        ObjectDemo objDemo4 = objDemo3;
        //Before overriding we are given default hashcode implemented in java
        //But after overriding we get what we want like i changed it with number mod 10
        System.out.println(objDemo1.hashCode());
        System.out.println(objDemo2.hashCode());
        System.out.println(objDemo3.hashCode());
        System.out.println(objDemo4.hashCode());
        //Now lets talk about object1.equal(object2)

        if(objDemo1.equals(objDemo2)){
            //Checks the content in object to be equal
            System.out.println("Obj1 equals Obj2");
        }
        if(objDemo1==objDemo2){
            //Checks these two variables points to the same object or not
            System.out.println("Obj1 == Obj2");
        }
    }
}
