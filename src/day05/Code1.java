package day05;

public class Code1 {
    void meth1() {
        System.out.println("meth1() is called");
    }

    public static void main(String[] args) {
        System.out.println("Java is awesome");
        Code1 obj = new Code1(); // 1st object
        obj.meth1();
        System.out.println("Java is more faster than other languages");
        new Code1().meth1(); // 2nd object
    }
}
