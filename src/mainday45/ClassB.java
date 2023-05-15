package mainday45;

public class ClassB extends ClassA {

    @Override
    // Annotations are not mandatory, but they will provide additional information
    // to the compiler & developers

    public ClassB meth1() {
        System.out.println(10);
        return new ClassB();
    }

    protected static void meth2(int x) {
        System.out.println(20);
    }

    public int meth3(int x, String val) {
        System.out.println(30);
        return x;
    }

    @Override
    String meth4(String data) {
        System.out.println(40);
        return data;
    }

    public static void main(String[] args) {

        ClassA obj1 = new ClassA();

        obj1.meth1();
        obj1.meth2(100);
        obj1.meth3(2212, "HR");
        obj1.meth4("Java is Awesome");
        System.out.println("----------------------------");

        ClassA obj2 = new ClassB();

        obj2.meth1();
        obj2.meth2(100);
        obj2.meth3(2212, "HR");
        obj2.meth4("Java is Awesome");
    }
}

/*
 * Output
 * 
 * ClassA meth1
 * ClassA meth2: 100
 * ClassA meth3: 2212
 * s: HR
 * ClassA meth4: Java is Awesome
 * ----------------------------
 * 10
 * ClassA meth2: 100
 * 30
 * 40
 */