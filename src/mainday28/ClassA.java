package mainday28;

// write a java program which prints 1-10 numbers

public class ClassA {
    void meth1() {
        int i;
        for (i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        new ClassA().meth1();
    }
}

/*
 * 
 * OUTPUT
 * 1
 * 2
 * 3
 * 4
 * 5
 * 6
 * 7
 * 8
 * 9
 * 10
 */
