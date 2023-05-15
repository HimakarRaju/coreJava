package mainday18;

public class ClassB {
    int a = 10;
    static int b = 20;

    void meth1() { // Non-Static /normal /concrete /instance method
        System.out.println("meth1() called");
        System.out.println("Instance Variable : " + a);
        System.out.println("Static Variable : " + b + "\n");
    }

    void meth2() { // Non-Static /normal /concrete /instance method
        System.out.println("meth2() called");
        System.out.println("Instance Variable : " + new ClassB().a);
        System.out.println("Static Variable : " + b + "\n");
    }

    public static void main(String[] args) {
        ClassB bobj = new ClassB();
        bobj.meth1();
        bobj.meth2();
    }
}

/*
 *
 * OUTPUT:
 * 
 * meth1() called
 * Instance Variable : 10
 * Static Variable : 20
 * 
 * meth2() called
 * Instance Variable : 10
 * Static Variable : 20
 * 
 */