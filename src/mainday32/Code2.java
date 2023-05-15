package mainday32;

public class Code2 {
    void meth1() {
        System.out.println("meth1() called");
        this.meth2(500);
    }

    void meth2(int x) {
        System.out.println("meth2() called" + x);
        String msg = meth3("Java is awesome");
        // String msg = this.meth3("Java is awesome");
        // Internal implementation of the compiler
        System.out.println("msg : " + msg);

    }

    String meth3(String s) {

        System.out.println("meth3() called");
        return s;
    }

    public static void main(String[] args) {
        new Code2().meth1();
        // this.meth1()//we can't use this keyword inside a static area
    }
}

/*
 * OUTPUT
 * 
 * meth1() called
 * meth2() called500
 * meth3() called
 * msg : Java is awesome
 */