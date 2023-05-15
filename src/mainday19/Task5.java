package mainday19;

public class Task5 {
    static int x = 10;
    static int y = 20;

    static {
        System.out.println("---Test11 SB1 Called---");
        System.out.println("X : " + x);
        System.out.println("Y : " + y);
    }

    static void m1() {
        int x = 100;
        System.out.println("Static method called");
        System.out.println("X : " + x);
        System.out.println("Y : " + y);
    }

    public static void main(String[] args) {
        m1();
    }

    static {
        System.out.println("---Test11 SB2 Called---");
        System.out.println("X : " + x);
        System.out.println("Y : " + y);
    }
}

/*
 * OUTPUT
 * -----------------------
 * 
 * ---Test11 SB1 Called--- 
 * 2      
 * X : 10
 * Y : 20
 * ---Test11 SB2 Called---
 * X : 10
 * Y : 20
 * Static method called
 * X : 100
 * Y : 20
 * 
 */
