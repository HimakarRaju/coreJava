package Assign_otherCls;

/*
 *
 * 
 * 
 *  Define a method which returns the least number among two numbers.
 * Write the method with the following specifications: 
 * Name of method: getLeastNum() // which accepts two integer values as argument and return the least value.
 * Arguments: two argument of type integer
 * Return type: an integer value 
 * Specifications: The value returned by the method getLeastNum() is determined by the following rules:
 * If any of the given numbers are negative, return -1.
 * If any of the given numbers are zero, return -2.
 * If the given numbers are positive, return the least number.
 */

public class Program3 {

    int getLeastNum(int a, int b) {

        if ((a < 0) || (b < 0)) {
            return -1;
        } else if ((a == 0) || (b == 0)) {
            return -2;
        } else if (a < b) {
            return a;
        }
        return b;

    }

    public static void main(String[] args) {
        System.out.println(new Program3().getLeastNum(20, 60));
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