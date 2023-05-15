//Task 1 for 03-04-2023 main day 12

package mainday12;

public class ClassA {
    public ClassA() {
        System.out.println("Sunday");
        ClassA aobj = new ClassA(10);
        System.out.println("Tuesday");
        String s = aobj.display("Challenge accepted");
        System.out.println(s);
    }

    public ClassA(int temp) {
        System.out.println("Saturday");
        ClassA aobj = new ClassA(10, 20);
        int a = aobj.meth1() + temp;
        System.out.println("====>" + (a + aobj.meth2()));
        System.out.println("monday");
    }

    String display(String s) {
        System.out.println("In the next statement I am returning String Value");
        return s;
    }

    int meth1() {
        return 100;
    }

    int meth2() {
        return 99;
    }

    public ClassA(int data, int temp) {
        System.out.println("Thursday");
        System.out.println("====>" + (data + new ClassA("HI").meth2() - temp));
    }

    ClassA(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        // ClassA aobj = new ClassA(); ==>method used in class
        new ClassA(); // method used for clean code
        System.out.println("Output verified");
    }
}
