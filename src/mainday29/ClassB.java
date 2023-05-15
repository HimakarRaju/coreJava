package mainday29;

import java.util.Scanner;

public class ClassB {
    Scanner sc = new Scanner(System.in);

    void meth1() {
        System.out.println("Please enter 1st number");
        int a = sc.nextInt();
        System.out.println("a value : " + a);

        System.out.println("Please enter 2nd number");
        int b = sc.nextInt();
        System.out.println("b value : " + b);

        int c = a + b;
        System.out.println("Addition : " + c);
    }

    void checkEligibility() {
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println(name + " What is your age ?");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println(name + " you are eligible to vote.");
        } else {
            System.out.println(name + " as your are is " + age);
            System.out.println("you are eligible to vote after " + (18 - age) + " years");
        }
    }

    public static void main(String[] args) {
        ClassB bobj = new ClassB();
        bobj.meth1();
        bobj.checkEligibility();
    }
}

/*
 * OUTPUT
 * meth1()=>
 * Please enter 1st number
 * 10
 * a value : 10
 * Please enter 2nd number
 * 15
 * b value : 15
 * Addition : 25
 * 
 * -------------------------------------------
 * 
 * checkEligibility()=>
 * Enter your name
 * HimakarRaju
 * HimakarRaju What is your age ?
 * 21
 * HimakarRaju you are eligible to vote.
 */