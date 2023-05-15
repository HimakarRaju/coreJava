package mainday05;

public class ClassA {
    void meth1() {
        System.out.println("CLass A method");
    }

    public static void main(String[] args) {
        ClassA aobj1 = new ClassA();
        ClassA aobj2 = new ClassA();

        System.out.println("aobj1 hashCode : " + aobj1.hashCode());
        System.out.println("aobj2 hashCode : " + aobj2.hashCode());

        System.out.println("\n");

        System.out.println(aobj1.equals(aobj2));
        System.out.println(aobj1.equals(aobj1));
        System.out.println(aobj2.equals(aobj1));
        System.out.println(aobj2.equals(aobj2));

        System.out.println("-------------------------");

        System.out.println(aobj1.equals(new ClassA()));
        System.out.println(new ClassA().equals(new ClassA()));
    }
}

/*
 * hashCode():
 * --------------
 * hashCode() does not provides the address location of an object.
 * It generates an unique identification number for our objects separately.
 * 
 * equals():
 * equals() compares two objects, whether they are present in the same address
 * or not.
 * If both the objects are present in the same address locations then
 * equals() is going to return true or else false.
 * 
 * 
 */