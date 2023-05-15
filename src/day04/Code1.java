package day04;

public class Code1 {
    void meth1() {
        int a = 100; // variable
        System.out.println("Hi");
        System.out.println("10");
        System.out.println("a");
        System.out.println(a);
        System.out.println(a + 900);
    }

    void meth2() {
        int x = 99;
        int y = 1;
        System.out.println("Hello");
        System.out.println("x: " + x); // x: 99
        System.out.println("y: " + y); // y: 1
        System.out.println("Addition: " + (x + y)); // Addition: 100
    }

    public static void main(String[] args) {
        System.out.println("Start");
        Code1 obj = new Code1();
        obj.meth1();
        System.out.println("Jagadheesh");
        obj.meth2();
    }
}
/*
 * Start
 * Hi
 * 10
 * a
 * 100
 * 1000
 * -----------------
 * Hello
 * X: 99
 * Y: 1
 * Addition: 100
 */