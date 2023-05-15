package mainday08;

public class ClassA {
    void meth1() {
        System.out.println("meth1() called");
        System.out.println(10);
        return;
    }

    int meth2() {
        System.out.println("meth2() called");
        System.out.println(20);
        return 100;
    }

    int meth3() {
        System.out.println("meth3() called");
        System.out.println(30);
        return 'A';

    }

    String meth4() {
        System.out.println("meth4() called");
        int i = 50;
        if (i <= 10) {
            System.out.println("If block is executed");
            return "Hi";
            // System.out.println("Hello World"); //C.E because it is Unreachable code
        } else {
            System.out.println("else block is executed");
            return "Hello";
            // System.out.println("Hello world"); //C.E because it is Unreachable code
        }
    }

    public static void main(String[] args) {
        System.out.println("Start");
        ClassA aobj = new ClassA();

        aobj.meth1();
        System.out.println("-----------");

        int x = aobj.meth2();
        System.out.println("meth2() is returning : " + x);
        System.out.println("-----------");

        int y = aobj.meth3();
        System.out.println("meth3() is returning : " + y);
        System.out.println("-----------");

        String data = aobj.meth4();
        System.out.println("meth4() is returning : " + data);
        System.out.println("-----------");

        System.out.println("End");

    }
}
