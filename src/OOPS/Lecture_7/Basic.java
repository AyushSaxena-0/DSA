package OOPS.Lecture_7;

public class Basic {

    // enum cannot extend any class explicitly because every enum already extends
    // java.lang.Enum
    // Java does not support multiple inheritance of classes
    // Therefore, an enum cannot extend another class
    // But enum can implement one or more interfaces

    enum Week implements A {

        // Enum in Java:-
        // Enum stands for Enumeration
        // It is a special type used to represent a fixed set of constants
        // Example: Days, Months, Directions, Status etc.

        // Example:
        // enum Day {
        //     MONDAY,
        //     TUESDAY,
        //     WEDNESDAY,
        //     THURSDAY,
        //     FRIDAY,
        //     SATURDAY,
        //     SUNDAY
        // }

        // We can create a variable of enum type
        // Day today = Day.MONDAY;

        // Enums are type-safe
        // We cannot assign an invalid value to an enum variable

        // Enums can also have:
        // 1. Fields
        // 2. Constructors
        // 3. Methods

        // values() method returns all enum constants
        // Example:
        // Day.values();

        // valueOf() converts a String into an enum constant
        // Example:
        // Day.valueOf("MONDAY");

        // Enums are useful when we have a fixed set of possible values

        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

        // These are enum constants

        // They are implicitly public static final
        // public -> Can be accessed from outside the enum
        // static -> They belong to the enum itself and not to any particular object
        // final -> They cannot be reassigned

        // Since enum is implicitly final, we cannot create child enums
        // We cannot extend an enum

        // Type of all these enum constants is Week

        // Constructor of enum
        // Enum constructors cannot be called using new from outside the enum
        // Java automatically creates the enum constants and calls this constructor
        Week() {
            System.out.println("Constructor is called " + this);
        }

        @Override
        public void hello() {
            System.out.println("Enum is saying hello from interface A");
        }

        // Enum constructors cannot be public
        // Enum constructors can be private or package-private
        // We cannot create new enum objects using the new keyword
        // The enum constants are created internally by Java

        // Conceptually, it is similar to:
        // public static final Week Monday = new Week();
        // public static final Week Tuesday = new Week();
        // etc.

        // But the actual implementation is handled by the Java compiler/JVM
    }

    public static void main(String[] args) {

        Week week = Week.Monday;

        System.out.println(week);

        // ordinal() returns the position/index of the enum constant
        // Index starts from 0
        // Monday -> 0
        // Tuesday -> 1
        // Wednesday -> 2
        System.out.println(week.ordinal());

        // We can compare enum constants using ==
        // Each enum constant is a unique object
        System.out.println(week == Week.Monday);

        // values() returns all enum constants
        for (Week day : Week.values()) {
            System.out.println(day);
        }

        // Enum can implement an interface
        week.hello();

        // valueOf() returns the enum constant whose name matches the given String
        System.out.println(Week.valueOf("Monday"));
    }
}