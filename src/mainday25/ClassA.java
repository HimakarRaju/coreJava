/* Date: 19/04/2023 */

//Understanding Switch Case Statement

package mainday25;

public class ClassA {
    void meth1(String day) {

        System.out.println("Implementing Switch Case");
        int a = 200;
        int b = 57;
        final int x = 10;

        int age = 35;

        /*
         * int c = 57;
         * byte b1 = 20;
         * 
         * 
         * // if used key value should be within the range of key value
         * // if (b1+30) is used as key the value returned is int or long
         */

        switch (a - 135 - b) {

            // System.out.println("Hello World");
            // individual statement is not allowed
            // returns C.E

            case x:
                System.out.println("Case 10 executed");
                switch (day) {
                    case "Wednesday":
                        System.out.println("Today we are dealing with switch");
                        break;
                    case "Thursday":
                        System.out.println("We will use switch in programs");
                }
                break;

            case 200:
                System.out.println("Case 20 executed");
                break;

            // case 30:
            // System.out.println("Case 30 executed");
            // break;

            case 'A':
                System.out.println("int & char both are compatible datatypes");
                break;

            case 40 / 5:
                System.out.println("Case 40 executed");
                if (age >= 18) {
                    System.out.println("You are eligible to vote");
                } else {
                    System.out.println("You are not eligible to vote");
                }
                break;

            case 50:
                System.out.println("Case 50 executed");
                break;

            default:
                System.out.println("default case got executed");
                break;
        }
        System.out.println("Compiler Came out from switch case");
    }

    public static void main(String[] args) {
        new ClassA().meth1("Wednesday");
    }
}

/*
 * OUTPUT
 * 
 * Implementing Switch Case
 * Case 40 executed
 * You are eligible to vote
 * Compiler Came out from switch case
 * 
 */