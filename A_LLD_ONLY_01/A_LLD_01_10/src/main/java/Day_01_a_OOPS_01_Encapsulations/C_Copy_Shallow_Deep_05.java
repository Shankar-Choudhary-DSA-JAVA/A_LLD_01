package Day_01_a_OOPS_01_Encapsulations;

class Student {

    String name;
    int age;

    // Parameterized Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
    }
}
public class C_Copy_Shallow_Deep_05 {

    public static void main(String[] args) {

        // Original Object
        Student s1 = new Student("Shankar", 25);

        // Shallow Copy (reference copy)
        Student shallowCopy = s1;

        // Modify shallowCopy object
        s1.age=26;
        s1.name="Ram";

        // Deep Copy (copy constructor)
        Student deepCopy = new Student(s1);
        // Modify deepCopy object
        deepCopy.age=26;
        deepCopy.name="Ram";

        // Modify original object
        s1.name = "Rahul";
        s1.age = 30;

        System.out.println("Original: " + s1.name + " " + s1.age);
        System.out.println("Shallow Copy: " + shallowCopy.name + " " + shallowCopy.age);
        System.out.println("Deep Copy: " + deepCopy.name + " " + deepCopy.age);
        System.out.println("Deep Copy: " + s1.name + " " + s1.age);

    }
}