package mainday22;

public class ClassB {

    void meth1() {
        System.out.println("Performing Auto-UnBoxing" + "\n");

        // Integer ival = new Integer(50);// 1st way
        // int i1 = ival;// 2nd way
        // int i2 = ival.intValue();// 3rd way

        // System.out.println("Integer WCO ival: " + ival);
        // System.out.println("int PDT i1: " + i1);
        // System.out.println("int PDT i2: " + i2 + "\n");

        // Float fval = new Float(10.6f);// 1st way
        // float f1 = fval;// 2nd way
        // float f2 = fval.floatValue();// 3rd way

        // System.out.println("Float WCO ival: " + fval);
        // System.out.println("float PDT f1: " + f1);
        // System.out.println("float PDT f2: " + f2 + "\n");

        // Byte bval = new Byte((byte) 5);// 1st way
        // byte b1 = bval;// 2nd way
        // byte b2 = bval.byteValue();// 3rd way

        // System.out.println("Byte WCO ival: " + ival);
        // System.out.println("byte PDT b1: " + b1);
        // System.out.println("byte PDT b2: " + b2 + "\n");
    }

    public static void main(String[] args) {
        ClassB aobj = new ClassB();
        aobj.meth1();
    }

}

// Todo: Convert other remaining wrapper classes to their primitive data types

/*
 * output
 * 
 * Performing Auto-UnBoxing
 * 
 * Integer WCO ival: 50
 * int PDT i1: 50
 * int PDT i2: 50
 * 
 * Float WCO ival: 10.6
 * float PDT f1: 10.6
 * float PDT f2: 10.6
 * 
 * Byte WCO ival: 50
 * byte PDT b1: 5
 * byte PDT b2: 5
 * 
 * Character
 */