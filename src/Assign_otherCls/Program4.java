package Assign_otherCls;

/*
 * 
 *
 * 
 * Define a method which returns the number it if it is an even number, if the number is odd then return the next multiple of 10.
 * 
 * Write the method with the following specifications: 
 * Name of method: oddRounder() // which accepts an integer value as argument and return the same value if it is an even number,
 * if the value is odd then return the next multiple of 10. 
 * 
 * Arguments: one argument of type integer
 * Return Type: an integer value 
 * Example if x = 24 then return 24, if x = 25 then return 30.
 * 
 * Specifications: The value returned by the method oddRounder() is determined by the following rules:
 * 
 * =>If any of the given number is negative, return -1.
 * =>If any of the given number is zero, return -2.
 * =>If the given number is even, return the same number.
 * =>If the given number is odd, return the next multiple of 10.
 * 
 * 
 */

public class Program4 {
    int oddRounder(int x) {
        if ((x < 0)) {
            return -1;

        } else if ((x == 0)) {
            return -2;

        } else if (x % 2 == 0) {
            return x; // even number, return the same value

        } else {
            return (x / 10 + 1) * 10; // odd number, return the next multiple of 10
        }

    }

    public static void main(String[] args) {
        System.out.println(new Program4().oddRounder(23));
    }
}

/*
 * 
 * OUTPUT
 * 
 * System.out.println(new Program4().oddRounder(-21)); ==> -1
 * System.out.println(new Program4().oddRounder(0)); ==> -2
 * System.out.println(new Program4().oddRounder(24)); ==> 24
 * System.out.println(new Program4().oddRounder(23)); ==> 30
 * 
 * 
 */