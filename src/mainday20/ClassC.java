package mainday20;

public class ClassC {
    int x = 12;
    static int y = 45;

    void m1() {
        System.out.println("Instance method m1()");
    }

    void m2() {
        System.out.println(x);
        new ClassC(500).m1();
        System.out.println(y);
        m3();
        System.out.println("Instance method m2()");
    }

    static void m3() {
        System.out.println("Static method m3()");
    }

    ClassC(int a) {
        y = a;
    }

    ClassC() {
        y = 50 - 38;
    }

    public static void main(String[] args) {
        System.out.println(y); // get value from top y = 45
        m3(); //static method m3()

        ClassC a = new ClassC(); //going to constructor ==>y = 50-38 = 12
        System.out.println(a.x);//12
        a.m2();
    }
}


/*
 * OUTPUT
 * ---------------
 * 45
 * Static method m3()
 * 12
 * 12
 * Instance method m1()
 * 500
 * Static method m3()
 * Instance method m2()
 * 
 * 
 * 
 */