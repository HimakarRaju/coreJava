package day05;

public class Code3 {
    void meth1(int a, int b) {
        System.out.println("a value : " + a);
        System.out.println("b value : " + b);
    }

    public static void main(String[] args) {
        System.out.println("Start");
        Code3 aobj = new Code3(); // Creating object Code3
        aobj.meth1(10, 20); // Values are passed while calling meth1()
                            // aobj.meth2() //compile time error as it is not present in code
        System.out.println("End");
    }
}
