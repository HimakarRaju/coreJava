package mainday13;

public class Student {
    Student() {
        System.out.println("Unknown");
    }

    Student(String s) {
        System.out.println("Student name : " + s);
    }

    public static void main(String[] args) {

        new Student();
        new Student("Himakar Raju");
    }
}
