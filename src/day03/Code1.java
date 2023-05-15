package day03;

public class Code1 {
    public void meth1() {
        System.out.println("Hello World");
    }

    private void meth2() {
        System.out.println("JAVA is awesome!");
    }

    public static void main(String[] args) {
        Code1 obj = new Code1();
        obj.meth1();
        obj.meth2();
    }

}
