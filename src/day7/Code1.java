package day7;

public class Code1 {
    String meth1(int a, String s) {
        System.out.println("Hi");
        System.out.println(a + a);
        return s + " is awesome";
    }

    int meth2() {
        System.out.println("Hello");
        return 100;
    }

    public static void main(String[] args) {
        /*
         * Code1 obj = new Code1();
         * String data = obj.meth1(100,"Java");
         * System.out.println("data");
         * System.out.println(data);
         */
        System.out.println(new Code1().meth1(100, "Java"));
        System.out.println("------------");
        System.out.println(new Code1().meth2() - 99);
    }
}
