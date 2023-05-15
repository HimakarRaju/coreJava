package mainday18;

public class ClassA {
    static int x;
    int y;

    ClassA() {
        System.out.println("Instance Variable : " + ++y);
        System.out.println("Static Variable : " + ++x + "\n");
    }

    public static void main(String[] args) {
        // ClassA aobj1 = new ClassA();
        // ClassA aobj2 = new ClassA();
        // ClassA aobj3 = new ClassA();
        new ClassA();
        new ClassA();
        new ClassA(); // commenting class objects which have references as they are not being used.
    }
}
/*
 * Output Expected
 * 1
 * 1
 * 
 * 1
 * 2
 * 
 * 1
 * 3
 * -------------------------
 * output Actual
 * 
 * Instance Variable : 1
 * Static Variable : 1
 * 
 * Instance Variable : 1
 * Static Variable : 2
 * 
 * Instance Variable : 1
 * Static Variable : 3
 * 
 * 
 */