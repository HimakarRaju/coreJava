package mainday03;

public class ClassA {
    void meth1() {
        System.out.println(10);
        System.out.println(20);

        System.out.println("---------------");

        System.out.print(100);
        System.out.println(200);

    }

    void meth2() { // write logic to print 3 statements in 5 lines.

        System.out.println("I love Java");
        System.out.print("Because ");
        System.out.println("it is awesome");
        System.out.print("Java is Object oriented");
        System.out.println("Programming Language");
    }

    public static void main(String[] args) {
        ClassA obj = new ClassA();
        obj.meth1();
        System.out.println("================");
        obj.meth2();
    }
}
