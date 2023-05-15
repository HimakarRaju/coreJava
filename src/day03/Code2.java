package day03;

public class Code2 {
    public void meth1() {
        Code2 obj = new Code2();
        System.out.println("meth1() called");
        obj.meth2();
        System.out.println("Hello World");
    }

    private void meth2() {
        System.out.println("meth2() called");
        System.out.println("java is awesome");
    }

    public static void main(String[] args) {
        System.out.println("Start");
        Code2 obj = new Code2(); // Creating an object
        obj.meth1(); // We are calling meth1
        System.out.println("End");
    }
}

/*
 * OUTPUT
 * ------------------------
 * start
 * meth1() called
 * meth2() called
 * JAVA is awesome!
 * Hello World
 * End
 * 
 */