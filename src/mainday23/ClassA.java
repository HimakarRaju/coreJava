package mainday23;

//control statements

public class ClassA {
    int i;

    void meth1(int a) {
        System.out.println("----------meth1()-------------");
        if (i <= 10) {
            System.out.println("hi");
        }
        System.out.println("hello");
        System.out.println("meth1() executed");

    }

    void meth2(int a) {
        System.out.println("----------meth2()-------------");
        if (a <= 10)
            System.out.println("hi");
        System.out.println("hello");
        System.out.println("meth2() executed");
    }

    void meth3(int a) {
        System.out.println("----------meth3()-------------");
        if (a <= 10) {
            System.out.println("if block executed");
            System.out.println("hi");
        } else {
            System.out.println("else block executed");
            System.out.println("hello");
        }
        System.out.println("meth3() executed");
    }

    void meth4(int a) {
        System.out.println("----------meth4()-------------");
        if (a <= 10)
            // int x =50; //C.E because we can't declare a value in this line
            System.out.println("if block executed");
        else
            System.out.println("else block executed");
        System.out.println("Hello");
        System.out.println("meth4() executed");
    }

    void meth5(int a) {
        System.out.println("----------meth5()-------------");
        if (true) {
            System.out.println("If block Executed");
        }
        // else {
        // System.out.println("else block executed");
        // System.out.println("hello");
        // }
        System.out.println("meth5() executed");
    }

    int meth6() {
        System.out.println("meth6() called");
        return 10;
    }

    int meth7() {
        System.out.println("meth7() called");
        return 5;
    }

    void meth8() {
        System.out.println("----------meth8()-------------");
        ClassA aobj = new ClassA();
        int a = aobj.meth6();
        if (a <= aobj.meth7() + 10) {
            System.out.println("hi");
        } else {
            System.out.println("hello");
        }
        System.out.println("meth8() executed");
    }

    void meth9(int num) {
        System.out.println("----------meth9()-------------");
        if (num > 0)
            System.out.println(num + " is a positive number");
        else if (num < 0)
            System.out.println(num + " is a negative number");
        else
            System.out.println(num + " is equal to zero");
        System.out.println("meth9() executed");
    }

    public static void main(String[] args) {
        ClassA aobj = new ClassA();
        aobj.meth1(5);
        aobj.meth2(50);
        aobj.meth3(5);
        aobj.meth4(5);
        aobj.meth5(50);
        aobj.meth8();
        aobj.meth9(5);
    }
}

/*
 * OUTPUT
 * 
 * 
 * ----------meth1()-------------
 * hi
 * hello
 * meth1() executed
 * ----------meth2()-------------
 * hello
 * meth2() executed
 * ----------meth3()-------------
 * if block executed
 * hi
 * meth3() executed
 * ----------meth4()-------------
 * if block executed
 * Hello
 * meth4() executed
 * ----------meth5()-------------
 * If block Executed
 * meth5() executed
 * ----------meth8()-------------
 * meth6() called
 * meth7() called
 * hi
 * meth8() executed
 * ----------meth9()-------------
 * 5 is a positive number
 * meth9() executed
 */