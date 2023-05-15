package mainday32;

public class Code4 {
    void meth1() {
        System.out.println("hi");
    }

    Code4() {
        this(500);
        this.meth1();
        System.out.println("Default Constructor");
        // new ClassA(500);
    }

    Code4(int x) {
        System.out.println("Parameterized constructor : " + x);
    }

    public static void main(String[] args) {
        new Code4();
    }
}


/*
 * OUTPUT
 * 
 * Parameterized constructor : 500
 * hi
 * Default Constructor
 */