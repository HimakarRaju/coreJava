package mainday30;

import java.util.Scanner;

public class ClassA {
    Scanner sc = new Scanner(System.in);

    String data = "Java is awesome";

    void meth1(int a, int b) {
        System.out.println("a value : " + a);
        System.out.println("b value : " + b);
        System.out.println("Addition : " + (a + b));

    }

    public static void main(String[] args) {
        ClassA aobj = new ClassA();
        System.out.println("Enter Parameters for meth1");
        aobj.meth1(aobj.sc.nextInt(), aobj.sc.nextInt());
        System.out.println(aobj.data);
    }
}

/*
 * OUTPUT
 * 
 * Enter Parameters for meth1
 * 99
 * 1
 * a value : 99
 * b value : 1
 * Addition : 100
 * Java is awesome
 */