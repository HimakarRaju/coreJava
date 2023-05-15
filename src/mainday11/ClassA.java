package mainday11;

public class ClassA {
    int a = 10; // Instance/Global/Non-Static
    static int b = 20; // static / class variable

    // String a = "Java"; // C.E because of same identifier names

    int x;
    static int y;

    void meth1() {
        int c = 30; // Local variables
        System.out.println("meth1() called");
        System.out.println("Instance variable : " + a);// by using identifier name
        System.out.println("Instance variable : " + new ClassA().a + "\n"); // by using Class Object

        System.out.println("Static variable : " + b);// by using identifier name

        // System.out.println("Static variable : " + new ClassA().b); //=>by using Class
        // Object

        System.out.println("Static variable : " + ClassA.b);// by using Class Object
        System.out.println("Static variable : " + ClassA.b + "\n");// by using Class Name

        System.out.println("Local Variable : " + c); // by using identifier name
    }

    void meth2() {
        System.out.println("meth2() called");
        System.out.println("Instance variable : " + a);
        System.out.println("Static variable : " + b);
        // System.out.println("Local Variable : " + c);

    }

    void meth3() {
        System.out.println("meth3() called");
        //int z; =>commented because it is unused
        System.out.println("Instance variable : " + a);
        System.out.println("Static variable : " + b);
        // System.out.println("Local Variable : " + z); // C.E because scope is only to
        // meth1()

    }

    void meth4() {
        System.out.println("meth4() called");
        int a = 100;
        int b = 200;
        System.out.println("Instance variable : " + a);
        System.out.println("Static variable : " + b);
        System.out.println("--------------------------------");
        System.out.println("Instance variable : " + new ClassA().a);
        System.out.println("Static variable : " + ClassA.b);

    }

    public static void main(String[] args) {
        ClassA aobj = new ClassA();
        aobj.meth1();
        System.out.println("----------------------------");
        aobj.meth2();
        System.out.println("----------------------------");
        aobj.meth3();
        System.out.println("----------------------------");
        aobj.meth4();
        System.out.println("----------------------------");
        System.out.println("END");
    }
}