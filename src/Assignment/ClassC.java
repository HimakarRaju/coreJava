package Assignment;

public class ClassC {
    public static void main(String[] args) {
        ClassA a = new ClassB();
        System.out.println(a.x);
        System.out.println(((ClassB) a).y);
        a.print();
    }
}
