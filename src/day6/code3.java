package day6;

public class code3 {
    int meth1() {
        System.out.println("Hi");
        return 99;
    }

    public static void main(String[] args) {
        int i = 100;
        System.out.println("Java is awesome");
        code3 obj = new code3();
        int x = obj.meth1();
        System.out.println("meth1() is returning: " + x);
        System.out.println(x + i);
    }
}
