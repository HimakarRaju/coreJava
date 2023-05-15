package mainday28;

//write a program to print table of given number and if a negative is given it should show invalid input

public class ClassC {

    void meth1(int n) {

        int i;

        if (n < 0) {
            System.out.println("negative number / Invalid Input");
        }
        for (i = 1; i <= 10; i++) {
            System.out.println((n + " * " + i) + " = " + (n * i));
        }
    }

    public static void main(String[] args) {
        new ClassC().meth1(2);
    }
}

/*
 * OUTPUT
 * 
 * 2 * 1 = 2
 * 2 * 2 = 4
 * 2 * 3 = 6
 * 2 * 4 = 8
 * 2 * 5 = 10
 * 2 * 6 = 12
 * 2 * 7 = 14
 * 2 * 8 = 16
 * 2 * 9 = 18
 * 2 * 10 = 20
 * 
 */