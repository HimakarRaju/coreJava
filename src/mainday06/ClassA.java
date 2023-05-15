package mainday06;

//getClass method demonstration
//toString method demonstration

public class ClassA {
    void meth1() {
        System.out.println("meth1() called");
    }

    public static void main(String[] args) {
        ClassA aobj1 = new ClassA();
        ClassA aobj2 = new ClassA();
        ClassA aobj3 = new ClassA();

        System.out.println("getClass() : " + aobj1.getClass());
        System.out.println("getClass() : " + aobj2.getClass() + "\n");
        // getClass() ===> It is going to return the Fully qualified ClassName

        System.out.println("aobj1 : " + aobj1); // Internally calling toString();
        System.out.println("aobj1 : " + aobj1.toString() + "\n");

        System.out.println("aobj2 : " + aobj2); // Internally calling toString();
        System.out.println("aobj2 : " + aobj2.toString() + "\n");

        System.out.println(aobj3);
        System.out.println(aobj3.toString());
    }
}

/*
 * Internal implementation of to string :
 * ----------------------------------------
 * public String toString() {
 *      return getClass() + getName() + "@" + Integer.toHexString(hashCode());
 *  }
 * 
 * 
 */



