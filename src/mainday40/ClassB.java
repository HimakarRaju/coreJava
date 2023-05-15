package mainday40;

import java.util.Scanner;

public class ClassB {

    void meth1() {

        Scanner sc = new Scanner(System.in);
        ClassA aobj = new ClassA();

        System.out.println("Enter your name : ");
        // aobj.sName = sc.next(); //C.E Because we are accessing private variable of ClassA
        aobj.setsName(sc.next());

        System.out.println("Enter your Id : ");
        // aobj.sId = sc.nextInt();
        aobj.setsId(sc.nextInt());

        System.out.println("Enter your Branch : ");
        // aobj.sBranch = sc.next();
        aobj.setsBranch(sc.next());

        System.out.println("--------User Details ---------");

        // System.out.println("Name : " + aobj.sName); // C.E Because we are accessing private variable of ClassA
        // System.out.println("Id : " + aobj.sId);
        // System.out.println("Branch : " + aobj.sBranch);

        System.out.println("Name : " + aobj.getsName());
        System.out.println("Id : " + aobj.getsId());
        System.out.println("Branch : " + aobj.getsBranch());

        sc.close();
    }

    public static void main(String[] args) {
        ClassB bobj = new ClassB();
        bobj.meth1();
    }
}

/*
 * Output
 * 
 * Enter your name :
 * kishan
 * Enter your Id :
 * 101
 * Enter your Branch :
 * MCA
 * --------User Details ---------
 * Name : kishan
 * Id : 101
 * Branch : MCA
 */
