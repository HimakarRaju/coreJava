package mainday19;

public class ClassA {
    static int x = ClassA.meth1();// Calling static method with the help of its respective Class Name

    static int meth1() {
        System.out.println("Meth1() called");
        return 100;
    }

    static {
        System.out.println("1st static block : " + x);
    }

    public static void main(String[] args) {
        System.out.println("main() executed : " + x);
    }

    static {
        System.out.println("2nd static block : " + x);
    }
}

/*
 * OUTPUT:
 * ----------------------------
 * Meth1() called
 * 1st static block : 100
 * 2nd static block : 100
 * main() executed : 100
 * 
 */