package OOPS.Lecture_5_Part_1;

public class Son extends Parent {
    public Son(int age) {
        super();
        this.age=age;
    }

    @Override
    public void carrer(){
        System.out.println("Son carrer is Doctor");
    }

    @Override
    void partner() {
        System.out.println("Son partner beautiful lady suzan");
    }
}
