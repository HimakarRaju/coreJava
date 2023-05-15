package mainday30;

import java.util.Scanner;

public class Task {

    static Scanner sc = new Scanner(System.in);

    int meth1(int a, String data) { // a value should be the value returned by meth3 //data value should be the
                                    // value which is returned by meth2
        System.out.println("meth1() called");
        System.out.println("a : " + a);
        System.out.println("data : " + data);
        System.out.println("enter int value to return from meth1()");
        return sc.nextInt();
    }

    String meth2(int x, int y) {
        System.out.println("meth2() called");
        System.out.println("x value : " + x);
        System.out.println("y value : " + y);
        System.out.println("Enter string data to return from meth2()");
        sc.nextLine();
        return sc.nextLine();
    }

    int meth3(int i) {
        System.out.println("meth3() called");
        System.out.println("i value : " + i);
        return i;
    }

    public static void main(String[] args) {
        Task tobj = new Task();
        int result = tobj.meth1(tobj.meth3(sc.nextInt()), tobj.meth2(sc.nextInt(), sc.nextInt()));
        System.out.println("result : " + result);
    }
}

/*
 * OUTPUT
 * 
 * 5
 * meth3() called
 * i value : 5
 * 2
 * 3
 * meth2() called
 * x value : 2
 * y value : 3
 * Enter string data to return from meth2()
 * java is good
 * meth1() called
 * a : 5
 * data : java is good
 * enter int value to return from meth1()
 * 1
 * result : 1
 */