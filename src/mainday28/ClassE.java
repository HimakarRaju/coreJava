package mainday28;

// write a program to print factorial of a number

public class ClassE {
    void meth1(int n) {
        int i;
        int fac = 1;
        for (i = n; i > 0; i--) {
            fac = fac * i;
            System.out.println(fac);
        }
    }

    public static void main(String[] args) {
        new ClassE().meth1(5);
    }
}

/*
 * OUTPUT
 * 
 * 
 * 5
 * 20
 * 60
 * 120
 * 120
 * 
 * 
 */
