package mainday20;

public class ClassA {
    static int x = m1();
    public static char[] a;

    public static void main(String[] args) {
        System.out.println(ClassA.x); // 120
    }

    static {
        System.out.println(x); // 100
        ClassA.x = x + 20; // ClassA.x = 100+20

    }

    static int m1() {
        ClassA.x = 50;
        return m2();
    }

    static int m2() {
        System.out.println(ClassA.x); // 50
        return 100;
    }
}

/*
 * OUTPUT
 * -------------
 * 50
 * 100
 * 120
 * 
 */

