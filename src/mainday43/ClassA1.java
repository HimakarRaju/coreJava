package mainday43;

public class ClassA1 {
    void meth1() {
        System.out.println("Class A method");
    }

    ClassA1() {
        System.out.println("Code 1 default constructor");
        this.meth1();
    }

    ClassA1(int a) {
        this();
        System.out.println("Code 1 parameterized constructor : " + a);
    }
}
//Java Constructor doesn't participate in instance