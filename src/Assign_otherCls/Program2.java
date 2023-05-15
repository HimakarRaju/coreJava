package Assign_otherCls;

/*
 * 
 * 
 * Define a method which returns the greatest number among two numbers.
 * Write the method with the following specifications: 
 * Name of method: getGreatest() // which accepts two integer values as argument and return the greatest value.
 * Arguments: two argument of type integer
 * Return type: an integer value 
 * 
 * Specifications: The value returned by the method getGreatest() is determined by the following rules:
 * If any of the given numbers are negative, return -1.
 * If any of the given numbers are zero, return -2.
 * If the given numbers are positive, return the greatest.
 * 
 * 
 */

public class Program2 {
    int getGreatest(int a, int b) {

        if ((a < 0) || (b < 0)) {
            return -1;
        } else if ((a == 0) || (b == 0)) {
            return -2;
        } else if (a > b) {
            return a;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(new Program2().getGreatest(-5, 60));
    }
}

/*
 * OUTPUT
 * 
 * System.out.println(new Program2().getGreatest(-5, 60)); ==> -1
 * System.out.println(new Program2().getGreatest(0, 60)); ==> -2
 * System.out.println(new Program2().getGreatest(20, 60)); ==> 60
 * 
 */
