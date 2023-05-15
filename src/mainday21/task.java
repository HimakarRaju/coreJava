package mainday21;

public class task {

    void implicit() {
        byte b = 10;
        System.out.println("byte value is " + b);
        short s = b;
        System.out.println("short value is " + s);
        s++;
        int i = s++;
        System.out.println("int value is " + i);
        System.out.println("Short value is " + s);
        long l = i;
        System.out.println("Long value is " + (--l));
        float f = l;
        System.out.println("The value of float is " + (f + b));
        double d = (--f);
        System.out.println("the value of double is " + d);
        show();
        if (!(d == f)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }

    public static void main(String[] args) {
        task a = new task();
        a.implicit();
    }

    static void show() {
        char c = 'A';
        int a = ++c;
        System.out.println(a);
        task aobj = new task();
        String s = aobj.meth1();
        System.out.println(s);
    }

    String meth1() {
        String s = "Implicit casting is done by the compiler automatically";
        return s;
    }
}

/*
 * 
 * byte value is 10
 * short value is 10
 * int value is 11
 * Short value is 12
 * Long value is 10
 * The value of float is 20.0
 * the value of double is 9.0
 * 66
 * Implicit casting is done by the compiler automatically
 * not equal
 * 
 * 
 */