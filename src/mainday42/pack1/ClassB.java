package mainday42.pack1;

public class ClassB extends ClassA { // Single - Inheritance

    public void meth2() {
        System.out.println("Class B method");
    }

    public ClassB() {
        System.out.println("Class B default constructor");
    }

    public static void main(String[] args) {
        ClassB bobj = new ClassB();
        bobj.meth1();
        bobj.meth2();
    }
}
