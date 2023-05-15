package mainday32;

public class Code3 {
    public Code3 meth1() {
        System.out.println("meth1() called");
        return this;
    }

    Code3 meth2() {
        System.out.println("meth2() called");
        return this;
    }

    int meth3() {
        System.out.println("meth3() called");
        return 99;
    }

    public static void main(String[] args) {
        int x = new Code3().meth1().meth2().meth3() + 1;
        System.out.println("x : " + x);
    }
}

/*
 * OUTPUT
 * 
 * meth1() called
 * meth2() called
 * meth3() called
 * x : 100
 */