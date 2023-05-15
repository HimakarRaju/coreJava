package mainday14;

public class ClassA {
    void meth1() {
        System.out.println("hi");
    }

    void meth2() {
        System.out.println("hello");
    }

    private ClassA() {
        System.out.println("Java is awesome");
        return;
    }

    private ClassA(String s) {
        System.out.println(s);
        return;
    }
}