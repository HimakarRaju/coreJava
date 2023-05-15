package day8;

public class Code1 {
    int meth1() {
        System.out.println("meth1() called");
        return 100;
    }

    void meth2(int i) {
        System.out.println("meth2() called");
        System.out.println("i value: " + i);
    }

    public static void main(String[] args) {
        Code1 obj = new Code1();
        // obj.meth1();
        // int x = obj.meth();
        // System.out.println(x-50);
        // System.out.println(obj.meth1()-50);
        obj.meth2(obj.meth1());
    }
}
