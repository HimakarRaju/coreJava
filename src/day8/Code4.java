package day8;

public class Code4 {
    void meth1(int a, String s) {
        System.out.println(a + a);
        System.out.println("a");
        System.out.println('a');
        System.out.println(a);
        System.out.println("s : " + s);
    }

    void meth2(int a, int b) {
        System.out.println(a * a);
        System.out.println(b);
        new Code4().meth4("Java is awesome");
        System.out.println(a - b);

    }

    void meth3(char c, int a) {
        System.out.println(c);
        System.out.println('c');
        System.out.println(a);
    }

    void meth4(String s) {
        new Code4().meth1(10, "Hello world");
        System.out.println(s);

    }

    public static void main(String[] args) {
        System.out.println("Start");
        new Code4().meth2(5, 10);
        System.out.println("End");
    }
}
