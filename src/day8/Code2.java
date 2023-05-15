package day8;

public class Code2 {
    int meth1(int a, int b) {
        System.out.println(a);
        System.out.println(a - b);
        return new Code2().meth4(a - 1, "hi");

    }

    String meth2(int x) {
        System.out.println(x - new Code2().meth1(200, 199));
        System.out.println(x);
        return "Java";

    }

    String meth3(int a, int b, String s) {
        System.out.println(a);
        System.out.println(a + a);
        System.out.println(a + b);
        return s;
    }

    int meth4(int a, String s) {
        System.out.println(a);
        System.out.println(s);
        return a + a;
    }

    String meth5(String s) {
        return s;
    }

    public static void main(String[] args) {
        System.out.println(new Code2().meth5(new Code2().meth3(15, 25, new Code2().meth2(500))));
    }
}

// new Code2().meth5(new Code2().meth3(15,25, new Task2().meth2(500)));
