//Agenda:
//       Understanding JAVA Constructor 

package mainday12;

public class ClassB {
    public ClassB() {
        System.out.println("Non-Parameterized constructor called");
        new ClassB("Hi").meth2();
    }

    ClassB(String s) {
        System.out.println("Parameterized constructor is called");
        new ClassB(99, 1);
    }

    ClassB(int a, int b) {
        System.out.println("Addition : "+(a+b));
    }
    void meth1() {
        System.out.println("Java is awesome");
    }

    void meth2() {
        System.out.println("meth2() is called");
    }
    public static void main(String[] args) {
        ClassB aobj = new ClassB();
        aobj.meth1();
    }
}
