package mainday29;

public class ClassA {
    void meth1() {
        System.out.println("Implementing Jump Statements");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                // break; // [Used ONLY in loops and switch case]
                // continue; // [Used ONLY in loops]
                return;// [It should be the last executable statement]
            }
            System.out.println("i value : " + i);
        }
        System.out.println("Compiler came out from for loop");
    }

    public static void main(String[] args) {
        System.out.println("Start");
        new ClassA().meth1();
        System.out.println("End");
    }
}

/*
 * OUTPUT
 * 
 * BREAK=>
 * Start
 * Implementing Jump Statements
 * i value : 1
 * i value : 2
 * i value : 3
 * i value : 4
 * Compiler came out from for loop
 * End
 * ---------------------------------------------------------
 * 
 * continue=>
 * Start
 * Implementing Jump Statements
 * i value : 1
 * i value : 2
 * i value : 3
 * i value : 4
 * i value : 6
 * i value : 7
 * i value : 8
 * i value : 9
 * i value : 10
 * Compiler came out from for loop
 * End
 * ---------------------------------------------------------
 * 
 * return=>
 * Start
 * Implementing Jump Statements
 * i value : 1
 * i value : 2
 * i value : 3
 * i value : 4
 * End
 */