package day6;

public class Code2 {
    void meth1(int a, int b) { // meth2() a=10, b=10
        Code2 obj = new Code2();
        System.out.println(a - 1);
        System.out.println(b);
        obj.meth4(10, 2, 2);
    }

    void meth2(int x) { // meth3() x=1
        Code2 obj = new Code2();
        System.out.println(x);
        obj.meth1(10, 10);
        System.out.println(x + 9);
    }

    void meth3(int x, int y) { // main() x=5, y=2
        System.out.println(x * y);
        Code2 obj = new Code2(); // Creating an object
        System.out.println(y);
        obj.meth2(1);
    }

    void meth4(int a, int b, int c) { // meth1() a=10,b=2,c=2
        System.out.println(a + b);
        System.out.println(a / b);
        System.out.println(a - b);
        System.out.println(a * b);
    }

    public static void main(String[] args) {
        Code2 obj = new Code2();
        obj.meth3(5, 2);
    }
}
