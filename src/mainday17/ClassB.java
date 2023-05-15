package mainday17;

public class ClassB {
    void meth1(int a, int b, String s) {
        String name = s;
        System.out.println(name + (a + b));
    }

    void meth2(int a, int b) {
        System.out.println("Subtraction : " + (a - b));
        System.out.println("Modulus : " + (a % b));
    }

    ClassB() {
        int a = 4;
        int b = 2;
        System.out.println("Division : " + (a / b));
    }

    ClassB(int a, int b) {
        System.out.println("multiplication : " + (a * b));
    }

    public static void main(String[] args) {
        new ClassB(2, 4).meth1(2, 4, "Addition : ");
        new ClassB().meth2(10, 5);
    }
}
