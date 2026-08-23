package OOPS.Lecture_5_Part_1;

public class Daughter extends Parent {
    public Daughter(int age) {
        this.age=age;
    }
    @Override
    public void carrer(){
        System.out.println("Daughter carrer is Engineer");
    }

    @Override
    void partner() {
        System.out.println("Daughter's partner is Honey Sing");
    }
}
