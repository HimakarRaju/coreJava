package Assign_otherCls;

/*
 * 
 * 
 * Define a method which returns 1 if the given number is positive, return -1 if the given number is negative, 
 * return 0 if the given number is 0.
 * 
 * Name of method findSign() 
 * Arguments: one argument of type integer
 * Return Type: an integer value 
 * 
 * Test Cases
 * 1.	If any of the given number is positive, return 1.
 * 2.	If any of the given number is negative, return -1.
 * 3.	If any of the given number is zero, return 0.
 * 
 * 
 */

public class Program5 {
    int findSign(int x) {
        if (x > 0) {
            return 1;

        } else if (x < 0) {
            return -1;

        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(new Program5().findSign(0));
    }
}

/*
 * OUTPUT
 * 
 * System.out.println(new Program5().findSign(10)); ==> 1
 * System.out.println(new Program5().findSign(-5)); ==> -1
 * System.out.println(new Program5().findSign(0)); ==> 0
 * 
 * 
 * 
 */
