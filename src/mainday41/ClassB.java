package mainday41;

public class ClassB extends ClassA {
    void meth2() {
        System.out.println("Class B method");
    }

    public static void main(String[] args) {

        ClassA aobj = new ClassA(); // 1st Point => Has - a -Relation
        aobj.meth1();
        // aobj.meth2(); //=> C.E

        ClassA aobj2 = new ClassB(); // 2nd point
        aobj2.meth1();
        // aobj2.meth2(); //=> C.E

        ClassB bobj = new ClassB(); // 3rd point Is - a - Relation
        bobj.meth1();
        bobj.meth2();

        // ClassB bobj2 = new ClassA(); // 4th point => C.E

    }
}
