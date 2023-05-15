package mainday26;

public class ClassA {
    void meth1(int i) {
        System.out.println("-------meth1()-------");
        while (i <= 5) {
            System.out.println("i value : " + i);
            i++;
        }
        System.out.println("meth1() executed");
    }

    void meth2(int i) {
        System.out.println("-------meth2()-------");
        while (i <= 10) {
            System.out.println("i value : " + i++);
            i++;
        }
        System.out.println("meth2() executed");
    }

    void meth3(int i) {
        System.out.println("-------meth3()-------");
        while (i <= 5)
            // int x =100; //C.E we should not write any declarative statement in this line
            System.out.println("i value : " + i++);
            i++;
            System.out.println("meth3() executed" + ++i);
    }

    void meth4(int i) {
        System.out.println("-------meth4()-------");
        while (true) {
            System.out.println("i value : " + i);
            i++;
        }
        // System.out.println("meth4() executed"); //C.E because of unreachable code
    }

    void meth5(int i) {
        System.out.println("-------meth5()-------");
        do {
            System.out.println("i value : " + i);
            i++;
        } while (i <= 5);
        System.out.println("meth5() executed");
    }

    public static void main(String[] args) {
        ClassA aobj = new ClassA();
        aobj.meth1(50);
        aobj.meth2(1);
        aobj.meth3(1);
        aobj.meth4(1);
        aobj.meth5(1);
    }
}
