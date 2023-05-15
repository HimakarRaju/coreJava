package mainday44;

public class Code1 {
    public final static void meth1() {
        System.out.println(10);
    }

    int meth1(int a) {
        System.out.println(20);
        return a;
    }

    private final void meth1(int a, String s) {
        System.out.println(30);
    }

    static String meth1(String s, int a) {
        System.out.println(40);
        return s;
    }

    static final protected void meth1(String s) {
        System.out.println(50);
    }

    char meth1(StringBuffer sb) {
        System.out.println(60);
        return sb.charAt(0);
    }

    final void meth1(byte b) {
        System.out.println(70);
    }

    public static void main(String[] args) {
        Code1 obj = new Code1();
        System.out.println("Implementing Method over Loading");
        obj.meth1();
        obj.meth1(100);
        obj.meth1(100, "Java");
        obj.meth1("Java", 100);
        obj.meth1("Java");
        obj.meth1(new StringBuffer("Java"));
        obj.meth1((byte) 10);
        System.out.println("----------------------------");
        main();
        main("Java is awesome");
    }

    public static void main() {
        System.out.println("1st main()");
    }

    public static void main(String s) {
        System.out.println("2nd main()");
    }
}