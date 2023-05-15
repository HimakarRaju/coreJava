package day6;

public class Code4 {
    int meth1(String s, char c) {
        System.out.println("s value: " + s);
        System.out.println(new Code4().meth2(10, 2) - 20);
        System.out.println("c value: " + c);
        return 100;
    }

    int meth2(int a, int b) {
        System.out.println("Hi");
        return a * b;
    }

    public static void main(String[] args) {
        int i = new Code4().meth1("Java", 'A');
        System.out.println(i / 2);
    }
}
