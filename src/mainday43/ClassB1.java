package mainday43;

public class ClassB1 extends ClassA1 {

    void meth2() {
        System.out.println("Code 2 method");
        super.meth1();
        this.meth3();
    }

    void meth3() {
        System.out.println("Java is awesome");
    }

    ClassB1() {
        super(500);
        this.meth2();
        // this.("Java"); //C.E
        System.out.println("Code 2 default constructor");
    }

    ClassB1(String s) {
        super();
        System.out.println("Code 2 parameterized constructor : " + s);
    }

    public static void main(String[] args) {
        ClassB1 obj = new ClassB1();
        obj.meth2();
    }
}

/*
 * Output
 * 
 * Code 1 default constructor
 * Class A method
 * Code 1 parameterized constructor : 500
 * Code 2 method
 * Class A method
 * Java is awesome
 * Code 2 default constructor
 * Code 2 method
 * Class A method
 * Java is awesome
 * 
 * 
 */