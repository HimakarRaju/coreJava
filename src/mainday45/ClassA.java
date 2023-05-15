package mainday45;

public class ClassA {
    public ClassA meth1() { // overridden method
        System.out.println("ClassA meth1");
        return new ClassA();
    }

    static void meth2(int a) {
        System.out.println("ClassA meth2: " + a);
    }

    protected int meth3(int a, String s) {
        System.out.println("ClassA meth3: " + a);
        System.out.println("s: " + s);
        return 100;
    }

    String meth4(String s) {
        System.out.println("ClassA meth4: " + s);
        return s;
    }
}
