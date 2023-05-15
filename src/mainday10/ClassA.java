package mainday10;

public class ClassA {
    int a;
    byte b;
    short s;
    long l;

    float f;
    double d;

    char c;
    boolean flag;

    void meth1() {
        System.out.println("int default value : " + a);
        System.out.println("byte default value : " + b);
        System.out.println("short default value : " + s);
        System.out.println("long default value : " + l + "\n");

        System.out.println("float default value : " + f);
        System.out.println("double default value : " + d + "\n");

        System.out.println("char default value : " + c);
        System.out.println("boolean default value : " + flag + "\n");

    }

    void meth2() {
        System.out.println("----------meth2()--------------" + "\n");

        byte b1 = 10; // byte range is -128 to 127
        byte b2 = 20;
        byte b3 = (byte) (b1 + b2); // 10+20=30 ===>int we need to typecast int value to byte using (byte) before
                                    // the value
        System.out.println("b3 value : " + b3);
        // Every number in java is by default considered as int
        // Every decimal in java is considered as double

        float f = 10.5f;
        long x = 2147483648l;

        System.out.println("float f : " + f);
        System.out.println("long x : " + x);

    }

    public static void main(String[] args) {
        ClassA aobj = new ClassA();
        aobj.meth1();
        System.out.println("------------------------------" + "\n");
        aobj.meth2();

    }
}
