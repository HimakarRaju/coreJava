package Assign_otherCls;

/*
 * 
 * 
 * Define a method which returns the 1 if the given number is even, in other case return 0
 * 
 * Name of method: isEven() // which accepts an integer value as argument and return 1 if the given number is even, else return
 * Argument: int
 * Return type: an integer value 
 * 
 * Example, if x = 22, return 1. if x = 35, return 0
 * 
 * 
 */

public class Program1 {
    int isEven(int x) {
        if (x % 2 == 0) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(new Program1().isEven(35));
    }
}

/*
 * OUTPUT
 * 
 * if main method argument
 * => System.out.println(new Program1().isEven(22)); ==> 1
 * => System.out.println(new Program1().isEven(35)); ==> 0
 * 
 */