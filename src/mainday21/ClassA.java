package mainday21;

public class ClassA {
    void implicit() {
        System.out.println("Implementing Implicit TypeCasting");

        byte b1 = 10;
        int i1 = b1;
        float f1 = b1;

        System.out.println("byte value : " + b1);
        System.out.println("int value : " + i1);
        System.out.println("float value : " + f1 + "\n");

        char c = 'A';
        int i2 = c;

        System.out.println("char value : " + c);
        System.out.println("char value : " + ++c);
        System.out.println("int value : " + i2 + "\n");

        long l = 500L;
        float f2 = l;

        System.out.println("Long value : " + l);
        System.out.println("Float value : " + f2);
    }

    void explicit() {
        System.out.println("Implementing Explicit TypeCasting");

        int x1 = 50;
        byte b1 = (byte) x1;

        System.out.println("int value : " + x1);
        System.out.println("byte value : " + b1);

        int x2 = 500;
        byte b2 = (byte) x2;

        System.out.println("int value : " + x2);
        System.out.println("byte value : " + b2);

        /*
         * [minimumRange + (result-maximumRange - 1)]
         * -128+(500-128)===>-128+372===>244
         * -128+(244-128)===>-128+116===>-12
         */

        float f = 10.99999f;
        byte b3 = (byte) f;

        System.out.println("float value : " + f);
        System.out.println("byte value : " + b3 + "\n");

    }

    public static void main(String[] args) {
        ClassA aobj = new ClassA();
        aobj.implicit();
        aobj.explicit();
    }
}

/*
 * 
 * 
 * Implementing Implicit TypeCasting
 * byte value : 10
 * int value : 10
 * float value : 10.0
 * 
 * char value : A
 * char value : B
 * int value : 65
 * 
 * Long value : 500
 * Float value : 500.0
 * Implementing Explicit TypeCasting
 * int value : 50
 * byte value : 50
 * float value : 10.99999
 * byte value : 10
 * 
 * 
 */