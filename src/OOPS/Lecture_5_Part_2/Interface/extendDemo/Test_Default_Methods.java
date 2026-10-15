package OOPS.Lecture_5_Part_2.Interface.extendDemo;
//But if you have multiple interface having same method name and you are implementing them in same class
//Then don't use Default methods
//It is an additional feature
//Static methods in interfaces should always have a body if they are present in interface
//As they cannot be overridden and cannot be inherited
//Also overridden methods should be better in access modifier terms
// In method overriding, the child method cannot have more restrictive
// access than the parent method.
// Example:
// Parent: protected → Child: protected or public
// Parent: default   → Child: default, protected, or public (same package)
// Parent: public    → Child: public only//Either same level of access modifiers or more access
//But cannot be more restrictive for example it cannot be private if originally the method was protected

public class Test_Default_Methods {
    public static void main(String[] args) {
        Annotations a = new Annotations();
        //fun() is in Annotations class
        a.fun();
        //greeting() is Default method implemented in Interface
        a.greeting();
    }
}
