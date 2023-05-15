package mainday22;

public class ClassA {

    void meth1() {
        // System.out.println("Performing Auto-Boxing" + "\n");
        // int i = 100;
        // Integer ival1 = i; // 1st way
        // Integer ival2 = new Integer(i);// 2nd way [The constructor Integer ( int ) is deprecated since version 9]
        // Integer ival3 = Integer.valueOf(i);// 3rd way

        // System.out.println("int PDT i: " + i);
        // System.out.println("Integer WCO ival1: " + ival1);
        // System.out.println("Integer WCO ival2: " + ival2);
        // System.out.println("Integer WCO ival3: " + ival3 + "\n");

        // char c = 'A';
        // Character cval = new Character(c);
        // System.out.println("char PDT c: " + c);
        // System.out.println("Character WCO cval: " + cval + "\n");

        // byte b = 50;
        // Byte bval = Byte.valueOf(b);
        // System.out.println("byte PDT b: " + b);
        // System.out.println("Byte WCO cval: " + bval + "\n");

    }

    public static void main(String[] args) {
        ClassA aobj = new ClassA();
        aobj.meth1();
    }
}

// Todo: create other wrapper classes for remaining data types

/*
 * OUTPUT
 * 
 * 
 * int PDT i: 100
 * Integer WCO ival1: 100
 * Integer WCO ival2: 100
 * Integer WCO ival3: 100
 * 
 * char PDT c: A
 * Character WCO cval: A
 * 
 * byte PDT b: 50
 * Byte WCO cval: 50
 * 
 */
