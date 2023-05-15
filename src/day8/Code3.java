package day8;

public class Code3 {
    public String testMethod1() { // main()
        System.out.println(35);
        return (new Code3().testMethod3(new Code3().testMethod2()) + new Code3().testMethod4("here"));
    }

    public int testMethod2() {
        System.out.println(25);
        return 25 + 5;

    }

    public String testMethod3(int a) {
        System.out.println(15);
        return "is";
    }

    public String testMethod4(String s) {
        System.out.println(45);
        return " awesome";
    }

    public static void main(String[] args) {
        Code3 t = new Code3();
        System.out.println("Java " + t.testMethod1());
    }
}
