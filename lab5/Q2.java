class Student {
    String name;
    int age;
    String department;

    Student() {
        this.name = "NULL";
        this.age = 0;
        this.department = "Null";
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.department = "IT";
    }

    Student(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age + ", Department: " + department);
    }
}

public class Q2 {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("Alice", 22);
        Student student3 = new Student("Bob", 23, "Computer Science");

        student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();
    }
}
