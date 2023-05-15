package mainday16;

public class inc_dec {

    int i = 10;
    int x = 50;

    void meth1() {
        System.out.println("meth1() called");
        System.out.println(i);
        System.out.println(i++);
        System.out.println(i-- + --i);

        System.out.println(++i);
        System.out.println(i);

        System.out.println(i--);
        System.out.println(i + i);
        System.out.println(--i + ++i);
    }

    void meth2() {
        System.out.println("meth2() called");

        System.out.println(x);
        System.out.println(x++);
        System.out.println(x++);
        System.out.println(x++);

        x = x++ + x++;

        System.out.println(++x);
        System.out.println(x--);
        System.out.println(x++);

        x = --x + -x;

        System.out.println(--x);
        System.out.println(x);
        System.out.println(x++);
        System.out.println(x);
        System.out.println(--x);
        System.out.println(x);

    }

    void meth3() {
        System.out.println("meth3() called");

        System.out.println(x);
        System.out.println(x++);
        System.out.println(x++);
        System.out.println(x++);

        x++;

        System.out.println(++x);
        System.out.println(x--);
        System.out.println(x++);

        x = ++x - --x;

        System.out.println(--x);
        System.out.println(x);
        System.out.println(x++);
        System.out.println(x + x++);
        System.out.println(--x);
        System.out.println(++x + x);

    }

    public static void main(String[] args) {
        inc_dec aobj = new inc_dec();
        aobj.meth1();
        aobj.meth2();
        aobj.meth3();
    }
}
