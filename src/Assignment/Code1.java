package Assignment;

public class Code1 {
    void meth1() {
        Code1 obj = new Code1();
        obj.meth5();
        int a = 10;
        System.out.println(10);
        System.out.println(54 + a);
    }

    void meth2() {
        int a = 20;
        System.out.println(78 - a);
    }

    void meth3() {
        // int a = 30;
        Code1 obj = new Code1();
        System.out.println(89 + 1);
        obj.meth1();
        System.out.println(10);
    }

    void meth4() {
        // int a = 10;
        System.out.println(89);
        System.out.println(85);
        System.out.println(44);
    }

    void meth5() {
        System.out.println(77);
        Code1 obj = new Code1();
        obj.meth2();
        System.out.println(99);
    }

    public static void main(String[] args) {
        System.out.println("Start");
        new Code1().meth3();
        System.out.println("End");
    }
}
