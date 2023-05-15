package day6;

public class Code1 {
    void meth1(int a, char c, String s) { // main() a=99, c=A, s= Java is awesome
        System.out.println("meth1() called");
        System.out.println("a value:" + a);
        new Code1().meth2(99, 1);
        System.out.println("c value:" + c);
        System.out.println("s value:" + s);
    }

    void meth2(int a, int b) { // meth() a=99, b=1
        System.out.println("method2() called");
        System.out.println(a + b + 1); // 99+1+1=101
    }

    public static void main(String[] args) {
        System.out.println("Start");
        new Code1().meth1(99, 'A', "Java is awesome");
        System.out.println("End");
    }
}
