package day7;

public class Code2 {
    void meth1() {
        System.out.println(10);
        System.out.println(64);
        System.out.println("End");
    }

    int meth2(int a, int b, int c) {
        System.out.println(a);
        Code2 obj = new Code2();
        String s = obj.meth5(100, "Java is awesome");
        System.out.println(s);
        return a - b;
    }

    String meth3(String s, int b, int d) {
        System.out.println(b + d);
        return s;
    }

    int meth4(int c, int k) {
        System.out.println(k);
        Code2 obj = new Code2();
        int result = obj.meth2(50, 50, 50);
        System.out.println(result);
        return k + 10;
    }

    String meth5(int a, String L) {
        System.out.println(a + a);
        Code2 obj = new Code2();
        String s = obj.meth3("Hi", 15, 10);
        System.out.println(s);
        return L;
    }

    public static void main(String[] args) {
        Code2 obj = new Code2();
        System.out.println("Start");
        int result = obj.meth4(20, 10);
        System.out.println(result);
        obj.meth1();
    }
}
